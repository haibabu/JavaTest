package com.babu.test.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.babu.test.Student;

class StudentTests {

	Student std=new Student();
	@Test
	void testGetName() {
		std.setName("Niranjan");
		assertEquals("Niranjan", std.getName());
	}

	@Test
	void testSetName() {
		std.setName("Nithya");
		assertEquals("Nithya", std.getName());
	}

	@Test
	void testGetRollNo() {
		std.setRollNo(100);
		assertEquals(Integer.valueOf(100), std.getRollNo());
	}

	@Test
	void testSetRollNo() {
		std.setRollNo(200);
		assertEquals(Integer.valueOf(200), std.getRollNo());
	}

}
