package com.yash.siddiqui;

import java.util.ArrayList;

public class SampleJason {


		 ArrayList < Person > accounting = new ArrayList < Person > ();
		 ArrayList < Person > sales = new ArrayList < Person > ();
		public ArrayList<Person> getAccounting() {
			return accounting;
		}
		public void setAccounting(ArrayList<Person> accounting) {
			this.accounting = accounting;
		}
		public ArrayList<Person> getSales() {
			return sales;
		}
		public void setSales(ArrayList<Person> sales) {
			this.sales = sales;
		}

	
}


class Person {
	 private String firstName;
	 private String lastName;
	 private float age;
	 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}



	}
