package eps11;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
 * Use HttpClient to replace HttpUrlConnection
 * */
public class EP04Http {

    @Test
    public void testHttpSync(){
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080/test/")).build();
        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, bodyHandler);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String body = httpResponse.body();
        System.out.println(body);
    }

    @Test
    public void testHttpAsync() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080/test/")).build();
        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();

        CompletableFuture<HttpResponse<String>> sendAsync = httpClient.sendAsync(httpRequest, bodyHandler);
        sendAsync.thenApply(t -> t.body())
                .thenAccept(System.out::println);
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = sendAsync.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        String body = httpResponse.body();
        System.out.println(body);
    }
}
