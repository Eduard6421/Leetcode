import java.util.HashMap;

class Solution1456 {
    public int maxVowels(String s, int k) {

        HashMap<Character, Boolean> vowelMap = new HashMap<>();

        // Insert vowels into the map
        vowelMap.put('A', true);
        vowelMap.put('E', true);
        vowelMap.put('I', true);
        vowelMap.put('O', true);
        vowelMap.put('U', true);
        vowelMap.put('a', true); // To handle lowercase
        vowelMap.put('e', true);
        vowelMap.put('i', true);
        vowelMap.put('o', true);
        vowelMap.put('u', true);

        int vowelCnt = 0;

        for(int i = 0 ; i < k ; ++i) {
            Boolean result = vowelMap.getOrDefault(s.charAt(i), false);
            if(result == true) {
                vowelCnt +=1;
            }
        }

        int left = 0 ;
        int right = k - 1;

        int maxVowelCnt = vowelCnt;

        while(right < s.length() - 1) {
            char oldChar = s.charAt(left);
            Boolean prevIsVowel = vowelMap.getOrDefault(oldChar, false);
            ++left;

            ++right;
            char newChar = s.charAt(right);
            Boolean newIsVowel = vowelMap.getOrDefault(newChar, false);

            if(prevIsVowel  == true) {
                vowelCnt -= 1;
            }
            if(newIsVowel == true) {
                vowelCnt += 1;
            }

            if(vowelCnt > maxVowelCnt) {
                maxVowelCnt = vowelCnt;
            }
        }

        return maxVowelCnt;
    }
}