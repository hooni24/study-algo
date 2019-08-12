package hbjo.practice;

public class Entry {

    /**
     * 테스트 1 〉	통과 (0.71ms, 48.1MB)
     * 테스트 2 〉	통과 (0.84ms, 48MB)
     * 테스트 3 〉	통과 (0.95ms, 47.9MB)
     * 테스트 4 〉	통과 (0.83ms, 48.1MB)
     * 테스트 5 〉	통과 (0.73ms, 48.3MB)
     * 테스트 6 〉	통과 (0.79ms, 47.7MB)
     * 테스트 7 〉	통과 (0.99ms, 48.1MB)
     * 테스트 8 〉	통과 (1.00ms, 47.8MB)
     * 테스트 9 〉	통과 (0.81ms, 47.9MB)
     */

    public static int solution(int n, int a, int b)
    {
        int answer = 1;
        while (a != b) {
            a = (a % 2) == 0 ? a : a + 1;
            b = (b % 2) == 0 ? b : b + 1;
            a /= 2;
            b /= 2;
            answer++;
        }
        return answer;
    }
}
