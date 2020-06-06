package hw1;

public class Logger {

    private static long startTime;
    private static Logger single_instance = null;

    public Logger(){
    }

    public static Logger getInstance() {
        if(single_instance == null){
            single_instance = new Logger();
        }
        return single_instance;
    }

    public void log(Object originator, String text){
        long t1 = System.currentTimeMillis();
        long t0 = t1 -startTime/1000;
        System.out.println(t0+": " + originator.getClass().getName() +": "+ text);
    }

    public static Logger create() {
        startTime = System.currentTimeMillis();
        return null;
    }
}
