package Java20;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class chatgpt {
	    public static String chatGPT(String prompt) {
	        String url = "https://api.openai.com/v1/chat/completions";
	        String apiKey = "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";
	        String model = "gpt-3.5-turbo";

	        try {
	            URL obj = new URL(url);
	            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
	            // Set up the connection properties (headers, method, etc.)
	            // Create the request body (JSON string with model and user prompt)
	            // Send the request and retrieve the response
	            // Process the response and extract the relevant information
	            // Handle exceptions (e.g., IOException)

	            // Example: Return the response from ChatGPT
	            return "ChatGPT response goes here";
	        } catch (IOException e) {
	            e.printStackTrace();
	            return "Error occurred while connecting to ChatGPT.";
	        }
	    }

	    public static void main(String[] args) {
	        String userPrompt = "write a simple code!";
	        String chatResponse = chatGPT(userPrompt);
	        System.out.println("ChatGPT response: " + chatResponse);
	    }
	}



