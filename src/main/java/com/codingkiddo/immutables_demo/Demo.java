package com.codingkiddo.immutables_demo;

public class Demo {
	public static void main(String[] args) {
		Person person = ImmutablePerson.builder().name("CodingKiddo")
				.age(35).build();
		
		System.out.println(person);
		
	}
}
