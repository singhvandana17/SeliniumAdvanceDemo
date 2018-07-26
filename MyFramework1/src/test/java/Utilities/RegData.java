package Utilities;

import java.awt.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="registrationData")
public class RegData {
	private java.util.List<Data> regdata;
	
	@XmlElement(name="data")
	public void setUserdata(java.util.List<Data> d)
	{
		this.regdata=d;
	}
	
	public java.util.List<Data> getUserdata(){
		return regdata;
	}

}
