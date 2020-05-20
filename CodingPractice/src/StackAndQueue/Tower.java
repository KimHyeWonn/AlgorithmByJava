package StackAndQueue;

public class Tower {
	
	public int[] solution(int[] heights) {
		int length = heights.length;
		int[] answer = new int[length];
		int i,j;
		
		for(i=length-1; i>=0; i--) {
			for(j=i-1; j>=0; j--) {
				if(heights[j]>heights[i]) {
					answer[i] = j+1;
					break;
				}
			}			
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Tower tower = new Tower();
		int[] heights = {6,9,5,7,4};
		int[] result;
		
		result = tower.solution(heights);
		
		System.out.print("결과: ");
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
		}
		
		
		
	}

}
