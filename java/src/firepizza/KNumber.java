package firepizza;

import java.util.Arrays;

public class KNumber {
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			answer[i] = cut(array, commands[i]);
		}
		
		return answer;
	}
	
	// [0]번째 부터 [1]번째 까지 자르고 오름차순정렬후 [2]번째
	private int cut(int[] array, int[] com) {
		
		int start = com[0];
		int last = com[1];
		int pos = com[2];
		
		int[] forged = new int[last - start + 1];
		int forgedIndex = 0;
		for(int i = start-1; i <= last-1; i++) {
			forged[forgedIndex++] = array[i];
		}
	
		Arrays.sort(forged);
		
		return forged[pos-1];
	}

}