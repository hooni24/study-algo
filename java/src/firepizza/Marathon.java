import java.util.HashMap;

public class Marathon {
    
    public String solution(String[] participant, String[] completion) {
        String result = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        for (String key : map.keySet()) {
            if(map.get(key) != 0) result = key;
        }
        
        return result;
    }
    
}