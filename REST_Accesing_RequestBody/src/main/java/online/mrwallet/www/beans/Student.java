package online.mrwallet.www.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
