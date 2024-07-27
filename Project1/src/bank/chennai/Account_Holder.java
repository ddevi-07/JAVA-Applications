package bank.chennai;

public class Account_Holder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		//if we get the variables from another class,We should either assign to another variable or have to get in print statement.
		System.out.println(SBI.branch_name);
		sbi.create_account();
		sbi.get_loan(2000000);
		System.out.println(sbi.empId);
		System.out.println(sbi.empName);

	}

}
