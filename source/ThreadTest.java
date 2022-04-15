import java.io.*;
import java.util.concurrent.*;
import java.util.*;

public class ThreadTest extends Thread {

	public void run() {
		
		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
	  exec.scheduleAtFixedRate(new Runnable() {
	  @Override
	
	public void run() {
	// do stuff
	
	System.out.println("another thread.");
  }
}, 0, 10, TimeUnit.SECONDS);
		
	}
}