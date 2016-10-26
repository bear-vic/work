import java.io.IOException;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;


public class InvokeWebScript {

	public static void main(String[] args) {
		
		// Create a new instance of HttpClient.
		HttpClient objHttpClient = new HttpClient();

		// Create a new method instance as required. Here it is GetMethod.
		GetMethod objGetMethod = new GetMethod("http://localhost:8080/alfresco/service/helloworld");

		// Set querystring parameters if required.
		objGetMethod.setQueryString(new NameValuePair[] { new NameValuePair("name", "Ramesh")});
			    
		// set the credentials if authentication is required.
		Credentials defaultcreds = new UsernamePasswordCredentials("admin","admin");
		objHttpClient.getState().setCredentials(new AuthScope("localhost",8080, AuthScope.ANY_REALM), defaultcreds);
			    
		try {
			// Now, execute the method using HttpClient.
			int statusCode = objHttpClient.executeMethod(objGetMethod);
			if (statusCode != HttpStatus.SC_OK) {
			System.err.println("Method invocation failed: " + objGetMethod.getStatusLine());
			}
	
			// Read the response body.
			byte[] responseBody = objGetMethod.getResponseBody();
	
			// Print the response body.
			System.out.println(new String(responseBody));

		} catch (HttpException e) {
			System.err.println("Http exception: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IO exception transport error: " + 
					e.getMessage());
			e.printStackTrace();
		} finally {
			// Release the method connection.
			objGetMethod.releaseConnection();
		}

	}
}
