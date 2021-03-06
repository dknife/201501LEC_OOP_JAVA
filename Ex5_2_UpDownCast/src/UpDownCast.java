class Person {
	String name;
	int id;
	public Person(String nameArg, int idInput) {
		name = nameArg;
		id = idInput;
	}
}

class Student extends Person {
	String grade;
	String department;
	
	public Student(String nameArg, int idInput) {
		super(nameArg, idInput);
		grade = "2";
		department = "game eng.";
	}
}

public class UpDownCast {
	
	public static void main(String[] argv) {
		Person p = new Student("Kang", 1234567);
		Student s = (Student) p;
		
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.grade);
		System.out.println(s.department);
		
		System.out.println(p.name);
		System.out.println(p.id);
		//  - grade is not the member of "Person"
		//System.out.println(p.grade);
		// - department is net the member of "Person"
		//System.out.println(p.department);
	}
	
}
