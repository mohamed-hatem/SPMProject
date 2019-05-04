package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.App;
import main.Student;

class SignUpTest {

	@Test
	void test() {
		App app = new App();
		assertEquals(true, app.SignUp(2));
	}
	
	@Test
	void test2() {
		App app = new App();
		assertEquals(true, app.SignUp(1));
	}
	
	@Test
	void test3() {
		App app = new App();
		assertEquals(false, app.SignUp(3));
	}
}
