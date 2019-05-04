package main;

import java.util.ArrayList;

public class App {
private static ArrayList<Game> gameList = new ArrayList<Game>();
	
	public static Boolean addGame(Game game)
	{   if(game==null)
		return false;
		if(gameList.add(game))
			return true;
		
		return false;
	}

	
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	
	public static ArrayList<Teacher> Teacherlist=new ArrayList<Teacher>() ;
	

	
	public static boolean addStudent(Student student) {
		if(studentList.add(student))
			return true;
		
		return false;
	}	

	public static boolean SignUp(int choise) {

		if(choise==1){
			Student student = new Student("AHMED",15,"Audh7dhfhue","ahmed@gjin");
			addStudent(student);
			return true;
		}
	
		else if(choise==2){
			addTeacher("AG","ag@mail","27","AGPASSWORD");
			return true;
		}
		
		return false; 
	}

	public static boolean addTeacher(String name,String email,String age,String password) {
		Teacher t=new Teacher();
		t.setName(name);
		t.setAge(age);
		t.setEmail(email);
		t.setPassword(password);
	
		return Teacherlist.add(t);	
	}

	public static boolean login(String email,String password)
	{
		for(int i=0;i<Teacherlist.size();i++){
			
			if(Teacherlist.get(i).getEmail().equals(email)==true&&Teacherlist.get(i).getPassword().equals(password)==true){
				return true;
			}		
		}
	
		for(int i=0; i<studentList.size();i++) {
			
			if(studentList.get(i).getEmail().equals(email)==true&&studentList.get(i).getPassword().equals(password)==true){
				return true;
			}
		}
	
	return false;
	}
	
}
