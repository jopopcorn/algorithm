import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String key : participant) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for(String key: completion){
            if(map.containsKey(key)){
                map.put(key, map.get(key)-1);
            }
        }

        String answer = "";

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet){
            if(entry.getValue() == 1){
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}
