package JUSTPRACTICE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class getPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileReader f=new FileReader("C:\\Users\\biswa\\eclipse-workspace\\MAVENPROJECT\\configure properties");
		Properties prop=new Properties();
		prop.load(f);
		System.out.println(prop.getProperty("url"));
		

	}

}
