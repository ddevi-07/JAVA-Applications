package developer.assignments;

public class Theatre {
	String movieName;
	int movie_time;
	
	Theatre(String name, int time){
		this.movieName =name;
		this.movie_time=time;
	}
	public static void main(String[] args) {
		//Create instance 
		
	    Theatre movie1 =new Theatre("Master", 630);
		Theatre movie2=new Theatre("Leo",7);
		//Method calling
		movie1.watch_movie();
		movie2.watch_movie();
		
	}
	//Method definition
	public void watch_movie() {
		System.out.println("Watching "+movieName);
		System.out.println("ShowTime is "+movie_time);
	}

}
