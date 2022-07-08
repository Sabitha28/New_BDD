package stepdefinition;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configfilereader {
	//Properties prop = new Properties();
	static String url;
	 static String username;
	 static String password;
	
	
	public static void Conreader () throws IOException{
		String propertyFilePath= "E:/Selenium_New/new/config/Configuration.properties";
		FileInputStream fileInput;

		Properties prop = new Properties();
		try {
			fileInput = new FileInputStream(propertyFilePath);
			prop.load(fileInput);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
 url = prop.getProperty("URL");
username =prop.getProperty("username");
	
	password=prop.getProperty("password");
		
	}

		
	
	public static String getPath() throws IOException{
		//String url = prop.getProperty("URL");
		if(url == null) {
			Conreader();
		}
			return url;
	
	}

	
	
	public static String getUserNane() throws IOException {
		  if (username == null) {
		   Conreader();
		  }
		  return username;
		 }	
	
	public static String getpassword() throws IOException {
		  if (password == null) {
		   Conreader();
		  }
		  return password;
		 }	
	
	}


	


