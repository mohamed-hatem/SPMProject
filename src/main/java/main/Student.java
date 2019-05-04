package main;

public class Student {
	String Name;
	String Email;
	int Age;
	String Password;
	
	public Student(String name, int age, String password, String email){
		this.Name = name;
		this.Age = age;
		this.Password = password;
		this.Email = email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
