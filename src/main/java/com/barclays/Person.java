package com.barclays;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	String name="NA";
	int age=1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
