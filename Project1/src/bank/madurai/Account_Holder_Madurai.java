package bank.madurai;

import bank.chennai.SBI;

public class Account_Holder_Madurai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//We cant access the static variable from another package
		// Default and Static variable are fetch from the same package. So declare all the varibles there in public 
		SBI sbi = new SBI();
		System.out.println(SBI.branch_name);
		sbi.create_account();
		sbi.get_loan(2000000);
		System.out.println(sbi.empId);
		System.out.println(sbi.empName);
	}

}
