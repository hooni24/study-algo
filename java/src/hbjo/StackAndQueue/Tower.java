package hbjo.StackAndQueue;

public class Tower {

    /**
     * 테스트 1 〉	통과 (1.61ms, 48MB)
     * 테스트 2 〉	통과 (1.54ms, 48.3MB)
     * 테스트 3 〉	통과 (1.73ms, 48.3MB)
     * 테스트 4 〉	통과 (1.44ms, 48.1MB)
     * 테스트 5 〉	통과 (1.63ms, 47.8MB)
     * 테스트 6 〉	통과 (1.54ms, 47.6MB)
     * 테스트 7 〉	통과 (1.73ms, 48.3MB)
     * 테스트 8 〉	통과 (1.71ms, 48.1MB)
     */

    public int[] solution(int[] heights) {
        int loopCount = heights.length;
        int[] answer = new int[loopCount];
        for(int i = loopCount-1; i>0; i--) {
            int tower = 0;
            for(int j= i-1; j>=0; j--) {
                if(heights[i] < heights[j]) {
                    tower = j+1;
                    break;
                }
            }
            answer[i] = tower;
        }
        return answer;
    }

}
