package hbjo.practice;

public class SkillTree {
    /**
     * 테스트 1 〉	통과 (1.40ms, 48MB)
     * 테스트 2 〉	통과 (1.30ms, 48.8MB)
     * 테스트 3 〉	통과 (1.10ms, 48.2MB)
     * 테스트 4 〉	통과 (1.03ms, 48MB)
     * 테스트 5 〉	통과 (1.24ms, 48.1MB)
     * 테스트 6 〉	통과 (1.33ms, 48MB)
     * 테스트 7 〉	통과 (1.07ms, 48.5MB)
     * 테스트 8 〉	통과 (0.99ms, 48.5MB)
     * 테스트 9 〉	통과 (1.20ms, 48MB)
     */
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] skList = skill.split("");
        for(String str : skill_trees) {
            int target = 100;
            int skCount = skList.length-1;
            while(skCount >= 0) {
                int co = str.indexOf(skList[skCount]);
                if(co == -1 && target != 100){
                    break;
                } else if (co == -1 && target == 100){
                } else {
                    if(target < co) {
                        break;
                    } else {
                        target = co;
                    }
                }
                if(skCount == 0) {
                    answer++;
                }
                skCount--;
            }
        }
        return answer;
    }
}
