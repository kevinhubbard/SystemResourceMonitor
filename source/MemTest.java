import java.io.*;
import java.util.concurrent.*;
import java.util.*;

public class MemTest {
	
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		ThreadtestTwo t2 = new ThreadtestTwo();
		t.start();
		t2.start();
		System.out.println("DONE");
	}
}



/*

ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
exec.scheduleAtFixedRate(new Runnable() {
  @Override
  public void run() {
    // do stuff
    System.out.println("farts");
  }
}, 0, 5, TimeUnit.SECONDS);	 */