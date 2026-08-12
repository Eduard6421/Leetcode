import java.util.ArrayList;

class Solution345 {
    public String reverseVowels(String s) {

        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        ArrayList<Integer> vowelPosition = new ArrayList<Integer>();
        ArrayList<Character> vowelChars = new ArrayList<Character>();

        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                vowelPosition.add(i);
                vowelChars.add(s.charAt(i));
            }
        }

        int k = vowelChars.size() - 1;

        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i < s.length(); ++i){
            if(vowels.contains(s.charAt(i))){
                str.append(vowelChars.get(k));
                k--;
            }
            else {
                str.append(s.charAt(i));
            }
        }

        return str.toString();
    }
}