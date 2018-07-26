package Utilities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="data")
public class Data {
	private String firstname;
	private String lastname;
	
	@XmlElement(name="Firstname")
	public void setfirstname(String f){
		this.firstname=f;
	}
	
	public String getfirstname(){
		return firstname;
	}
	
	@XmlElement(name="Lastname")
	public void setlastname(String f){
		this.lastname=f;
	}
	public String getlastname(){
		return lastname;
	}
	

}
