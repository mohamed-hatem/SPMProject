package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Student;
import main.App;
class LoginTest {

	@Test
	void testsuccess() {
		App ap=new App();
		ap.addTeacher("teacher3", "email3@yahoo.com", "50", "12345678");
		assertEquals(true,ap.login("email3@yahoo.com","12345678"));
	}
	@Test
	void testsuccess2() {
		App ap=new App();
		App.addStudent(new Student("studenta", 50, "12345678","email4@yahoo.com"));
		assertEquals(true,ap.login("email4@yahoo.com","12345678"));
	}
	@Test
	void testfail() {
		App ap=new App();
		assertEquals(false,ap.login("email3@yahoo.com","12345678"));
	}
}