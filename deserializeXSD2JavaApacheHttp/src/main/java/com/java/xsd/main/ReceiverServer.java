package com.java.xsd.main;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.xsd.jaxb.NachrichtStrafStrafverfahren0500013;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.bootstrap.HttpServer;
import org.apache.http.impl.bootstrap.ServerBootstrap;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import org.apache.http.protocol.UriHttpRequestHandlerMapper;
import org.apache.http.util.EntityUtils;

public class ReceiverServer {

	static int i=0;
	
    public static void main(String[] args) throws Exception {
        // Create an ObjectMapper instance
        final ObjectMapper objectMapper = new ObjectMapper();

        // Create an HTTP server using Apache HttpCore
        HttpServer server = ServerBootstrap.bootstrap()
        		.setListenerPort(7777) // Replace with your desired port
                .setHandlerMapper(new UriHttpRequestHandlerMapper() {
                    protected void registerHandlers(HttpRequestHandlerRegistry registry) {
                        // Define a custom request handler
                        registry.register("/data", new RequestHandler(objectMapper));
                    }
                })
                .create();

        server.start();
        System.out.println("Receiver server started on port 7777.");
    }

    static class RequestHandler implements HttpRequestHandler {
        private final ObjectMapper objectMapper;

        RequestHandler(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
        }

        @Override
        public void handle(HttpRequest request, HttpResponse response, HttpContext context) throws HttpException, IOException {
            if (request instanceof HttpEntityEnclosingRequest) {
                HttpEntity entity = ((HttpEntityEnclosingRequest) request).getEntity();
                String receivedJson = EntityUtils.toString(entity);

                System.out.println("Data received from sender machine: " + receivedJson);

                // Deserialize the JSON data into a Java object
                NachrichtStrafStrafverfahren0500013 nachricht = objectMapper.readValue(receivedJson, NachrichtStrafStrafverfahren0500013.class);
                if(nachricht != null)
                	System.out.println("Deserialized Nachricht " + i + ": " + nachricht.getNachrichtenkopf().getEigeneNachrichtenID());
                i++;
            }

            response.setStatusCode(HttpStatus.SC_OK);
        }
    }
}
