package developer.assignments;

public abstract class  HeadOffice {

	public void check_account(int amount) {
		System.out.println("Account checking");
	}
	public int pay_tax(int amount) {
		return amount;
	}
	public abstract void receive_customers() ;
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
