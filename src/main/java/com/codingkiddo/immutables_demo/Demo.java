package com.codingkiddo.immutables_demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

public class Demo {
	public static void main(String[] args) throws JsonProcessingException {
		Person person = ImmutablePerson.builder().name("CodingKiddo")
				.age(35).build();
		
		System.out.println(person);
		
		ObjectMapper objectMapper = new ObjectMapper()
		        .registerModule(new Jdk8Module()); // safe if using Optional, etc.

		String json = objectMapper.writeValueAsString(person);
		System.out.println(json);
		
		Person roundTripped = objectMapper.readValue(json, ImmutablePerson.class);
		System.out.println(roundTripped);
	}
}
