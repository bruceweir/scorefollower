package at.ofai.music.server;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class DataStorage {
	private HashMap <Integer, Integer> refMap =  new HashMap<Integer, Integer>();

	public HashMap<Integer,Integer> getHashmap() throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("/home/brucew/scorefollower/Sos.txt"));
		 while (sc.hasNextLine()) {

       int timing= sc.nextInt();
       int bar = sc.nextInt();
  
      refMap.put(timing, bar);
	}
		return refMap;   
	}
}
