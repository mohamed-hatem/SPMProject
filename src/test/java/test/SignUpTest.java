package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.App;

 final class SignUpTest {

	@Test
	void test() {
		
		assertEquals(true, App.SignUp(2));
	}
	
	@Test
	void test2() {
		
		assertEquals(true, App.SignUp(1));
	}
	
	@Test
	void test3() {

		assertEquals(false, App.SignUp(3));
	}
}
