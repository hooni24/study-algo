package hbjo.Improve;

import javax.xml.transform.Templates;
import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {

        int day = 1;
        int success = 0;
        int progress = 0;

        List<Integer> tempList = new ArrayList<>();
        while (progress < progresses.length) {
            boolean add = false;

            if( (progresses[progress] +  (speeds[progress] * day) ) < 100 ) {
                day++;
                add = true;
            } else {
                success++;
                progress++;
            }

            if(add && (success > 0)) {
                tempList.add(success);
                success = 0;
            }
        }
        tempList.add(success);
        success = 0;

        int[] answer = new int[tempList.size()];

        for(int i : tempList) {
            answer[success++] = i;
        }
        return answer;
    }


}
