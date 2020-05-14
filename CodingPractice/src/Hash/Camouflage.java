package Hash;

import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {
	
	public int camouflageTest (String[][] clothes) {
		int answer = 1;
		int i;
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		for(i=0; i<clothes.length; i++) {
			hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		Iterator<Integer> itValue = hm.values().iterator();
		
		while(itValue.hasNext()) {
			int temp = itValue.next()+1; 
			answer = answer*temp;
		}
		
		answer = answer-1;
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses","eyewear"},
				{"green_turban","headgear"},{"crow_mask","face"},
				{"blue_sunglasses","face"},{"smoky_makeup","face"}} ;
		Camouflage cf = new Camouflage();
		
		int result;
		
		result = cf.camouflageTest(clothes);
		
		System.out.println("Result: " + result);
		
		
	}

}
