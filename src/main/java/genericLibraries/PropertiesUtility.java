package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class PropertiesUtility {
	private Properties property;
	
public void PropertiesInit(String filepath) {
	FileInputStream fis =null;
	try 
	{
		 fis = new FileInputStream(filepath);
	} catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	
	property = new Properties();
	try
	{ 
	  property.load(fis);
	}	
	catch(IOException e) 
	{
		e.printStackTrace();
	}
	
 }

/**
 * This method is used to fetch data from properties file using key
 * @param Key
 * @return
 */

 public String readDataFromProperties(String key) 
 {
	 return property.getProperty(key);
 }
 
 /**
  * This method is used to write data to properties file
  * @param key
  * @param value
  * @param filepath
  * @param comments
  * @param fos
  */
 
 public void WriteToProperties(String key,String value,String filepath,String comments,Writer fos) {
	 property.put(key, value);
	 FileOutputStream  fos1 = null;
	 try 
	 {
	       fos1 = new  FileOutputStream(filepath);
	}
	 catch (FileNotFoundException e)
	 {
		e.printStackTrace();
	 } 
  }
}
