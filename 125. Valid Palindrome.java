class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int startIndex = 0;
        int endIndex = sb.length()-1;

        while(startIndex < endIndex) {
            if(sb.charAt(startIndex) != sb.charAt(endIndex)) {
                return false;
            }
            startIndex+=1;
            endIndex-=1;
        }

        return true;
    }
}
