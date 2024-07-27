package developer.assignments;

public class EB_Reading {
	
    //Global variables
		int consumed_units;
		int unit;
		//Constructor
		EB_Reading(int unit)
		{
		this.unit=unit;
		}
		//Main  class
		public static void main(String[]args)
		{
		//Create instance	
		EB_Reading assessor = new EB_Reading(100);
		assessor.reading();//Method calling
		assessor.calculate();
		}
		//Method definition
		long reading()
		{
		System.out.println("consumed_units "+consumed_units);
		consumed_units=unit;
		System.out.println("consumed_units "+consumed_units);
		return consumed_units;

		}
		//Methos definition
		void calculate()
		{

		int bill=consumed_units*7;
		System.out.println("Paymet for the EB "+bill);
		}
		}

