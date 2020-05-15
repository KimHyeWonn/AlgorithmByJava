package array;

import java.util.Arrays;

public class KNumber {
	
	public int[] Solution(int[] array, int[][] commands) {
		
		int[] answer = new int[commands.length];
		int size = commands.length;
		int a,i,j,k;
		
		
		for(a=0; a<size; a++) {
			i = commands[a][0];
			j = commands[a][1];
			k = commands[a][2];
			
			int[] subArray = Arrays.copyOfRange(array, i-1, j);
			Arrays.sort(subArray);
			answer[a] = subArray[k-1];
		}		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		int[] result;
		
		KNumber kn = new KNumber();
		result = kn.Solution(array, commands);
		
		System.out.println("Result: " + result);
		
		
	}

}
