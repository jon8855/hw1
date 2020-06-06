package hw1;

import java.util.Random;

public class Rotate implements Runnable {

	public Rotate() {
		Logger log = Logger.create();
		Logger.getInstance().log(this,"Initializing Centripetal Force");
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
			Logger.getInstance().log(this, "To everything, turn, turn, turn");
		}
		Logger.getInstance().log(this, "I'm dizzy!");
	}
}
