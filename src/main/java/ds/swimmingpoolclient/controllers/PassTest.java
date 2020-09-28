package ds.swimmingpoolclient.controllers;

import ds.swimmingpoolclient.models.Client;
import ds.swimmingpoolclient.models.Pass;
import ds.swimmingpoolclient.payloads.PassPayload;
import ds.swimmingpoolclient.requests.Request;
import ds.swimmingpoolclient.utils.FData;
import ds.swimmingpoolclient.utils.Logging;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import java.io.IOException;
import java.util.Random;

public class PassTest {
    private final String endPoint = "http://localhost:8080/api/pass";

    private final Random rand = new Random();

    public void createPass(int passNumber) throws IOException {
        for (int i=0; i<passNumber; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new PassPayload(FData.getType(), FData.getPassPrice()))
                    .response(Client.class).build();
            Logging.printObject(post.send(), "Creating Pass");
        }
    }


    public Pass getRandomPass() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(Pass[].class).build();
        Pass[] passes = (Pass[]) get.send();
        return passes[rand.nextInt(passes.length)];
    }

    public void testService() throws IOException{
        System.out.println("Purchase service testing".toUpperCase());
        createPass(2);
    }
}

