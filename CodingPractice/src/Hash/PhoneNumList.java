
package Hash;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumList {
    public boolean solution(String[] phone_book) {
        int i;
        boolean answer = true;
        int pb_size = phone_book.length;
        int str_size;
        String compare;
        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        for(i=0;i<pb_size;i++){
            hashMap.put(i ,phone_book[i]);
        }

        for(i=0;i<pb_size;i++){
            compare = hashMap.get(i);
            str_size = compare.length();
            for(int key : hashMap.keySet()){
            		if(key == i) { //자기 자신을 비교하지 않도록 
            			continue;
            		}
            		if(str_size > hashMap.get(key).length()) {	//접두어가 비교하는 str의 길이보다 길
            			continue;
            		}
                if (compare.equals( hashMap.get(key).substring(0, str_size))) {
                    return false;
                }
            }
            if(answer == false){
                return false;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		PhoneNumList pnl = new PhoneNumList();
		String[] phone_book = {"97674223","119", "1195524421"};
		
		System.out.println(pnl.solution(phone_book));	
	}	
}
