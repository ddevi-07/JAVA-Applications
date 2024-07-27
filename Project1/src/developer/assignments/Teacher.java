package developer.assignments;

public class Teacher {
	   //We cant access any modifiers inside the main method
	private int teacherSalary=10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Created the SChhol instance to call the method in Schoool class
		School sc= new School();
		sc.conduct_exams();
	    sc.publish_results(99);
	    // The variable is declared as static, So we call that from class name
		System.out.println(School.school_name);
		//sc.teacherSalary;/,
		
	}

}
