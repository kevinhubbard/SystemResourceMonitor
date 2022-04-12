import java.io.*;
import java.util.concurrent.*;
import java.util.*;

public class ThreadtestTwo extends Thread {
	public void run() {
		
			ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
exec.scheduleAtFixedRate(new Runnable() {
  @Override
  public void run() {
    // do stuff
    System.out.println("a");
  }
}, 0, 5, TimeUnit.SECONDS);
		
	}
}