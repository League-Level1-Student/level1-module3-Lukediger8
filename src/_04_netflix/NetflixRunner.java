package _04_netflix;

public class NetflixRunner {
public static void main(String[] args) {
	Movie one = new Movie("Naruto",5);
	Movie two = new Movie("Demon Slayer",5);
	Movie three = new Movie("Seven Deadly Sins",5);
	Movie four = new Movie("Bleach", 5);
	Movie five = new Movie("Home alone",5);
	Movie six = new Movie("Home alone 2",5);
	Movie seven = new Movie("Home alone 3",5);
	Movie eight = new Movie("Home alone 4",5);
	Movie nine =  new Movie("Home alone 5",5);
	Movie ten = new Movie("Noelle",5);
	
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(one);
	queue.addMovie(two);
	queue.addMovie(three);
	queue.addMovie(four);
	queue.addMovie(five);
	queue.addMovie(six);
	queue.addMovie(seven);
	queue.addMovie(eight);
	queue.addMovie(nine);
	queue.addMovie(ten);
	queue.printMovies();
	queue.getBestMovie();

	
			
		}
	}


