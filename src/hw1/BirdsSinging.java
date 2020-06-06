package hw1;

import java.util.Random;

public class BirdsSinging implements Runnable {
	
	public BirdsSinging() {
		//Logger log = Logger.create();
		Logger.getInstance().log(this,"I tawt I taw a puddy tat!");
		//Logger.getInstance().log(this,"I tawt I taw a puddy tat!");
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
			Logger.getInstance().log(this,"I did! I did!");
		}
		Logger.getInstance().log(this,"Tweet tweet");
	}

}
