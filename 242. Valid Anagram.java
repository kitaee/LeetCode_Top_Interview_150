import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++) {
            int count = 1;
            String target = String.valueOf(magazine.charAt(i));
            if(map.containsKey(target)) {
                count = map.get(target) + 1;
            }
            map.put(target, count);
        }

        for(int i=0; i<ransomNote.length(); i++) {
            String target = String.valueOf(ransomNote.charAt(i));
            if(!map.containsKey(target) || map.get(target) == 0) {
                return false;
            }
            map.put(target, map.get(target)-1);
        }

        return true;
    }
}
