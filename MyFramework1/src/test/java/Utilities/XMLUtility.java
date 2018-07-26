package Utilities;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class XMLUtility {
	public void readXML() throws JAXBException{
		
		java.io.File f=new java.io.File("TestData.xml");
		
		JAXBContext j= JAXBContext.newInstance(RegData.class);
		Unmarshaller u=j.createUnmarshaller();
		RegData r=(RegData) u.unmarshal(f);
		List<Data> mydata=r.getUserdata();
		
		for(Data d :mydata){
			System.out.println("First Name is "+d.getfirstname());
			System.out.println("Last Name is "+d.getlastname());
		}
	}
	
	public static void main(String args[]) throws JAXBException{
		XMLUtility X=new XMLUtility();
		X.readXML();
	}

}
