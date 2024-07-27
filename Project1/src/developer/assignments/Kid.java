package developer.assignments;

public class Kid extends Mother {

	String name = "Suman";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Kid kid = new Kid();
		
		kid.study();
	}
	public void work() {
		super.work();
		System.out.println("=====================");
		System.out.println("Name "+name);
		System.out.println("Kid Super Name "+ super.name);
	}
     public void study() {
    	// The below code  will call the  mother method, if there is no method in this name then it search in Granda class
    	 	// super.work();
    	 this.work();
    	 
     }

}
