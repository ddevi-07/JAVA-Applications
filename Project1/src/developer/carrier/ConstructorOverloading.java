package developer.carrier;

public class ConstructorOverloading {
	

		//Method declaration
			//Static -used instead of instance creation to call Method
				   int add(int a,int b){return a+b;}  
				   static int add(int a,int b,int c){return a+b+c;}  
				    
				    
				    public static void main(String[] args){  
				   // System.out.println(add(11,11));  
				    System.out.println(add(11,11,11)); 
			                 //OR
			
			       /*  int add (int a,int b)
			         {
			        	 return a+b;
			        	 }  
			          int add(int a,int b,int c)
			          {
			        	  return a+b+c;
			        	  }
			          
			          public static void main(String[] args){  
			        	  ConstructorOverloading cons=new ConstructorOverloading();
			        	 long total= cons.add(11, 10);
			        	 System.out.println(total);
			        	 
			        	 long sum= cons.add(2, 9, 12);
			        	 System.out.println(sum);*/
			        	  
				    }
			     	
			          }  