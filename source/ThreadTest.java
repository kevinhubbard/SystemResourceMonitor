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
    System.out.println("b");
  }
}, 0, 5, TimeUnit.SECONDS);
		
	}
}


/*


		String totMem = "cmd /c systeminfo | findstr /C:\"Total Physical Memory\"";
		try {
        Process process = Runtime.getRuntime().exec(totMem);
        System.out.println(process.getOutputStream());
        BufferedReader reader=new BufferedReader( new InputStreamReader(process.getInputStream()));
        String s; 
        while ((s = reader.readLine()) != null){
            System.out.println(s);
            String ans = "";
 			for (int i = 0; i < s.length(); i++) {
 				if (Character.isDigit(s.charAt(i))) {
 					//System.out.println(s.charAt(i));
 					ans += s.charAt(i);
 					
 				}

 			}
 			System.out.println(ans);
        }                   
    } catch (IOException e) {
        e.printStackTrace();
    }*/