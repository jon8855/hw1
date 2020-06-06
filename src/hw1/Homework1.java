package hw1;

import java.util.concurrent.Executors;

public class Homework1 {

	public static void main(String[] args) {
		Logger log = Logger.create();
		//Logger.getInstance().log(log,"Starting the world");
		
		Rotate theByrds = new Rotate();
		BirdsSinging frankie = new BirdsSinging();
		BeesBuzzing tcb = new BeesBuzzing();

		Executors.newSingleThreadExecutor().execute(theByrds);
		Executors.newSingleThreadExecutor().execute(frankie);
		Executors.newSingleThreadExecutor().execute(tcb);
	}

}
