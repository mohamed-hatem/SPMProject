package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Student;
import main.App;

class LoginTest {

	@Test
	void testsuccess() {
		App.addTeacher("teacher3", "email3@yahoo.com", "50", "12345678");
		assertEquals(true,App.login("email3@yahoo.com","12345678"));
	}
	@Test
	void testsuccess2() {
		
		App.addStudent(new Student("studenta", 50, "12345678","email4@yahoo.com"));
		assertEquals(true,App.login("email4@yahoo.com","12345678"));
	}
	@Test
	void testfail() {
		
		assertEquals(false,App.login("email4@yahoo.com","12345679"));
	}
}
