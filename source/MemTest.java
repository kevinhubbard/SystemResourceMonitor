import java.io.*;
import java.util.concurrent.*;
import java.util.*;
	
public class MemTest {
	
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		ThreadtestTwo t2 = new ThreadtestTwo();
		t.start();
		t2.start();
	}
}
