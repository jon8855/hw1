package hw1;

import java.util.Random;

public class BeesBuzzing implements Runnable {
	public BeesBuzzing() {
		//Logger log = Logger.create();
		Logger.getInstance().log(this,"I thought I smelled honey");
	}

	@Override
	public void run() {
		Random rnd = new Random();
		for (int i=0; i<100; i++) {
			try {
				Thread.currentThread().sleep(rnd.nextInt(10)*500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Logger.getInstance().log(this,"Buzz buzz buzz goes the bumblebee");
		}
		Logger.getInstance().log(this,"Someone go get Owl!");
	}
}
