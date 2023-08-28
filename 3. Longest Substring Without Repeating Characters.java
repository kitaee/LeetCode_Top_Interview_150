import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) {
            return 0;
        }
        int answer = 1;
        int startIndex = 0;
        int endIndex = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put(String.valueOf(s.charAt(startIndex)), 1);

        while(endIndex < s.length()) {
            if(map.containsKey(String.valueOf(s.charAt(endIndex)))) {
                map.remove(String.valueOf(s.charAt(startIndex)));
                startIndex+=1;
            }
            else {
                map.put(String.valueOf(s.charAt(endIndex)), 1);
                answer = Math.max(answer, endIndex-startIndex+1);
                endIndex+=1;
            }
        }

        return answer;
    }
}
