package basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectFB {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try {
			
			URL u = new URL("https://www.facebook.com");
			
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			
			System.out.println("response code of "+u +" is "+con.getResponseCode());
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
	}
}
