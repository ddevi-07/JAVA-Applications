package developer.assignments;

public class Mother extends Grandma{
	String name = "Arasi";
	public void work() {
		//Method calling from Grandma class	
		super.work();
		System.out.println("Super Name "+super.name);
		System.out.println("Mother Work method definiton");
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instance declaration
		Mother mother = new Mother();
		//Method calling
		mother.work();
 
	}

}
