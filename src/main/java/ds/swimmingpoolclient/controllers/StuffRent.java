package ds.swimmingpoolclient.controllers;

import ds.swimmingpoolclient.models.SwimmingStuff;
import ds.swimmingpoolclient.payloads.SwimmingStuffPayload;
import ds.swimmingpoolclient.requests.Request;
import ds.swimmingpoolclient.utils.FData;
import ds.swimmingpoolclient.utils.Logging;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import java.io.IOException;
import java.util.Random;

public class StuffRent {
    private final String endPoint = "http://localhost:8080/api/swimmingstuff";

    private final Random rand = new Random();

    public void createSwimmingStuff(int swimmingStuffNumber) throws IOException {
        for (int i=0; i<swimmingStuffNumber; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new SwimmingStuffPayload(FData.getSwimmingStuff(), FData.getPrice()))
                    .response(SwimmingStuff.class).build();
            Logging.printObject(post.send(), "Creating Swimming Stuff");
        }
    }

    public SwimmingStuff getRandomSwimmingStuff() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(SwimmingStuff[].class).build();
        SwimmingStuff[] swimmingStuffs = (SwimmingStuff[]) get.send();
        return swimmingStuffs[rand.nextInt(swimmingStuffs.length)];
    }


    public void test() throws IOException{
        System.out.println("Swimming Stuff service testing".toUpperCase());
        createSwimmingStuff(2);
    }
}

