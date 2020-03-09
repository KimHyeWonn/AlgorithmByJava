package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class PoorRunner {

    public String solution(String[] participant, String[] completion) {
    	String answer = "";
        int partSize = participant.length;
        int comSize = completion.length;
        boolean check = false;
        int i,j;
        int start = 0;

    	Arrays.sort(participant);
        Arrays.sort(completion);
       
        // HashMap 처리
        HashMap<Integer, String> partMap = new HashMap<Integer, String>();
        HashMap<Integer, String> comMap = new HashMap<Integer, String>();
        
        for(i=0; i<comSize; i++) {
        	partMap.put(i, participant[i]);
            comMap.put(i, completion[i]);
        }
        partMap.put(partSize-1, participant[partSize-1]);
          
        // 비교 시작
        for(i=0; i<partSize; i++){  
            check = false;
            for(j=start; j<comSize; j++){
                if(partMap.get(i).equals(comMap.get(j))){
                	comMap.remove(j); // 같은게 있으면 지워줌
                	start++;
                    check = true;
                    break;
                }
            }
            if(check == false){
                answer = partMap.get(i);
                break;
            }
        } 
        return answer;
    }   

	
	public static void main(String[] args) {
		PoorRunner pr = new PoorRunner();
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"filipa","josipa","marina","nikola"};

		
		String result = pr.solution(participant,completion);
		
		System.out.println("결과: " + result);
		
	}
}
