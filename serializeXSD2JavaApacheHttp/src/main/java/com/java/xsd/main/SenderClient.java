package com.java.xsd.main;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.java.xsd.jaxb.*;
import java.io.*;
import java.net.Socket;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

public class SenderClient {

    public static void main(String[] args) {
        try {
            // Create an ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();
            int i=1;

            // Create an HTTP client using Apache HttpClient
            HttpClient httpClient = HttpClients.createDefault();

            // Define the URL of the receiver server
            String receiverUrl = "http://127.0.0.1:7777/data"; // Replace with the receiver's IP and port

            while (i<1001) {
	            // Serialize a Java object to JSON
	            String filename = "nachrichten/nachricht_" + i + ".xml";
	        	  
	            String json = objectMapper.writeValueAsString(jaxbXmlFileToObject(filename));
	
	            // Create an HTTP POST request
	            HttpPost httpPost = new HttpPost(receiverUrl);
	
	            // Set the JSON data as the request entity
	            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
	            httpPost.setEntity(entity);
	
	            // Send the POST request to the receiver server
	            httpClient.execute(httpPost);
            }
            //System.out.println("Data sent to receiver server.");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Finished processing all XML files!");
        
    }
 
  private static NachrichtStrafStrafverfahren0500013 jaxbXmlFileToObject(String fileName) {
     
    File xmlFile = new File(fileName);
     
    JAXBContext jaxbContext;
    try
    {
      jaxbContext = JAXBContext.newInstance(NachrichtStrafStrafverfahren0500013.class);
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
       
      NachrichtStrafStrafverfahren0500013 nachricht = (NachrichtStrafStrafverfahren0500013) jaxbUnmarshaller.unmarshal(xmlFile);
       
      //System.out.println(nachricht.getNachrichtenkopf().getEigeneNachrichtenID());
      return nachricht;
    }
    catch (JAXBException e) 
    {
      e.printStackTrace();
    }
	return null;
  }
}