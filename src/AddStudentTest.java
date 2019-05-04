package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Student;
import main.App;

class AddStudentTest {

	@Test
	void test() {
		Student student = new Student("Ahmed",15,"AH1534F","ahmed@k");
		assertTrue(App.addStudent(student));
	}
}