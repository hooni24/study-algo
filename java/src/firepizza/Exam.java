import java.util.ArrayList;

public class Exam {
    
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        
        if(score[0] == maxScore) {list.add(1);}
        if(score[1] == maxScore) {list.add(2);}
        if(score[2] == maxScore) {list.add(3);}
        
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
}
