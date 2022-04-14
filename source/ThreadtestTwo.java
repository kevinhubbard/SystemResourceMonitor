import java.io.*;
import java.util.concurrent.*;
import java.util.*;
	
public class ThreadtestTwo extends Thread {
	public void run() {
		ScheduledExecutorService exe = Executors.newSingleThreadScheduledExecutor();
		exe.scheduleAtFixedRate(new Runnable() {
			public void run() {
				String driveSizeCmd = "wmic logicaldisk get size";
				try {
					Process process1 = Runtime.getRuntime().exec(driveSizeCmd);
					BufferedReader reader1 = new BufferedReader(new InputStreamReader(process1.getInputStream()));
					String cmdOutput1;
					while ((cmdOutput1 = reader1.readLine()) != null) {
						String output1 = "";
						for (int i = 0; i<cmdOutput1.length(); i++) {
							if (Character.isDigit(cmdOutput1.charAt(i))) {
								output1 += cmdOutput1.charAt(i);
							}
						}
						System.out.println("out1" + output1);
					}
				} catch (IOException e) {e.printStackTrace();}

				try {
					String freeDriveCmd = "wmic logicaldisk get freespace";
					Process process2 = Runtime.getRuntime().exec(freeDriveCmd);
					BufferedReader reader2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
					String cmdOutput2;
					while ((cmdOutput2 = reader2.readLine()) != null) {
						String output2 = "";
						for (int i = 0; i<cmdOutput2.length(); i++) {
							if (Character.isDigit(cmdOutput2.charAt(i))) {
								output2 += cmdOutput2.charAt(i);
							}
						}
						System.out.println("out2" + output2);
					}
				} catch (IOException e) {
					e.printStackTrace();
					
				}




			}
		}, 0, 10, TimeUnit.SECONDS);
	}


}















/*public class ThreadtestTwo extends Thread {
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
}*/