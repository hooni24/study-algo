package hbjo.BruteForceSearch;

import java.util.*;

public class Exam {

    public int[] solution(int[] answers) {
        int[] answer = {};

        int one = checking(answers, 1, 2, 3, 4, 5);
        int two = checking(answers, 2, 1, 2, 3, 2, 4, 2, 5);
        int three = checking(answers, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, one);
        map.put(2, two);
        map.put(3, three);

        answer = orderby(map);

        return answer;
    }

    private int[] orderby(Map<Integer, Integer> map) {
        List<Integer> resultList = new ArrayList<Integer>();
        int loopSize = map.size() ;
        int target = 0;
        for(int i=1; i<=loopSize; i++) {
            if(target < map.get(i)){
                target = map.get(i);
                resultList.clear();
                resultList.add(i);
            } else if (target == map.get(i)) {
                resultList.add(i);
            }
        }
        int[] rInt = new int[resultList.size()];
        for(int i =0; i< resultList.size(); i++) {
            rInt[i] = resultList.get(i);
        }
        Arrays.sort(rInt);
        return rInt;
    }


    private int checking(int[] answers, int... userAnswer) {
        int userAnswerLoopCount = userAnswer.length;
        int loopCount = 0;
        int answer = 0;
        for(int i : answers) {
            if(userAnswerLoopCount == loopCount)
                loopCount = 0;
            if(i == userAnswer[loopCount++])
                answer++;
        }
        return answer;
    }

}
