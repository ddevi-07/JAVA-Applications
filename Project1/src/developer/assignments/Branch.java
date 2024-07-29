package developer.assignments;

public class Branch extends Branch_Plan {

	public static void main(String[] args) 
	{
	
      Branch branch=new Branch();
      branch.check_account(1000);
      System.out.println(branch.pay_tax(100));
      branch.do_interview();
	}
     
     
	@Override
	public void receive_customers()
	{
		// TODO Auto-generated method stub
		System.out.println("grand daughter");
	}
 
}
