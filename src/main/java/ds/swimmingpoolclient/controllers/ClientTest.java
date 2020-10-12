package ds.swimmingpoolclient.controllers;

import ds.swimmingpoolclient.models.Client;
import ds.swimmingpoolclient.payloads.ClientPayload;
import ds.swimmingpoolclient.requests.Request;
import ds.swimmingpoolclient.utils.FData;
import ds.swimmingpoolclient.utils.Logging;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import java.io.IOException;
import java.util.Random;

public class ClientTest {
    private final String endPoint = "http://192.168.56.1:8080/api/clients";

    private final Random rand = new Random();

    public void createClients(int clientsNumber) throws IOException {
        for (int i=0; i<clientsNumber; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new ClientPayload(FData.getName(), FData.getSurname(), FData.getTemperature()))
                    .response(Client.class).build();
            Logging.printObject(post.send(), "Creating Client");
        }
    }

    public Client getRandomClient() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(Client[].class).build();
        Client[] clients = (Client[]) get.send();
        return clients[rand.nextInt(clients.length)];
    }


    public void testService() throws IOException{
        System.out.println("Client service testing".toUpperCase());
        createClients(1);
    }
}
