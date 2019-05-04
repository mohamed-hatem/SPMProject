package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.App;

class AddTeacherTest {

	@Test
	void addTeachersuccess() {
		
		assertEquals(true,App.addTeacher("teacher3", "email3@yahoo.com", "50", "12345678"));
}
	
}