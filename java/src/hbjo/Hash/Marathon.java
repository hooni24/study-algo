package hbjo.Hash;

import java.util.Arrays;
import java.util.HashMap;

public class Marathon {

    /**
     *  solution1 보다 solution2가 6배 정도의 좋은 효율을 보임
     *
     */

    /**
     * 정확성  테스트
     * 테스트 1 〉	통과 (1.13ms, 48.1MB)
     * 테스트 2 〉	통과 (0.96ms, 48.1MB)
     * 테스트 3 〉	통과 (4.58ms, 48MB)
     * 테스트 4 〉	통과 (8.27ms, 50.2MB)
     * 테스트 5 〉	통과 (7.22ms, 50.4MB)
     * 효율성  테스트
     * 테스트 1 〉	통과 (109.70ms, 86.7MB)
     * 테스트 2 〉	통과 (169.83ms, 93.4MB)
     * 테스트 3 〉	통과 (263.81ms, 98.5MB)
     * 테스트 4 〉	통과 (314.11ms, 97.8MB)
     * 테스트 5 〉	통과 (338.26ms, 98MB)
     */
    public String solution1(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int len = completion.length;
        for (int i = 0; i < len; i++) {
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[len];
    }

    /**
     * 개선
     * 정확성  테스트
     * 테스트 1 〉	통과 (0.97ms, 48.4MB)
     * 테스트 2 〉	통과 (0.88ms, 48.3MB)
     * 테스트 3 〉	통과 (1.21ms, 48.8MB)
     * 테스트 4 〉	통과 (1.53ms, 50.5MB)
     * 테스트 5 〉	통과 (1.30ms, 48.2MB)
     * 효율성  테스트
     * 테스트 1 〉	통과 (23.48ms, 86.2MB)
     * 테스트 2 〉	통과 (45.95ms, 93.6MB)
     * 테스트 3 〉	통과 (44.75ms, 97.8MB)
     * 테스트 4 〉	통과 (43.20ms, 100MB)
     * 테스트 5 〉	통과 (60.91ms, 99.6MB)
     */
    public String solution2(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap();
        for(String str : completion){
            map.put(str, map.get(str) == null ? 1 : map.get(str) + 1);
        }
        String re = "";
        try {
            for(String str : participant){
                re = str;
                int i = map.get(str);

                if (i == 0) {
                    return re;
                } else {
                    map.put(str, i-1);
                }
            }
        } catch(Exception e) {
            return re;
        }
        return re;
    }
}
