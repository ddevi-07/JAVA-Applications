package bank.chennai;

public class SBI {
	 
	 //If we write o in starting of number get error "literal 09 of type itn is out of range"
	 //Comment this below code instead write code to access from another package;
	 //We cant access Default constructor from another package. 
	
	 /*int empId = 98878;
	   String empName="JAVA";
	 static String branch_name ="chennai";
	 
	 void get_loan(int amount) {
		 System.out.println("Get loan");
	 }
	 void create_account() {
		 System.out.println("Create Account");
	 }*/
	//This si to access from another package  Account_Holder_Madurai  fromanother package
	public String empName="JAVA";
	public int empId = 98878;
	 public static String branch_name ="chennai";
	 
	 public void get_loan(int amount) {
		 System.out.println("Get loan");
	 }
	 public void create_account() {
		 System.out.println("Create Account");
	 }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method sbranch_name = 'chennai'tub

	}

}
