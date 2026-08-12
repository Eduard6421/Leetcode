import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

class Solution443 {

    private char[] numberToCharArray(int number) {
        ArrayList<Character> charList = new ArrayList<>();

        // Extract digits from the number
        while (number > 0) {
            int digit = number % 10;
            char convertedChar = (char) (digit + '0');
            charList.add(convertedChar);
            number /= 10; // Move to the next digit
        }

        // Reverse the list to get the correct order
        Collections.reverse(charList);

        // Convert ArrayList<Character> to char[]
        char[] charArray = new char[charList.size()];
        for (int i = 0; i < charList.size(); i++) {
            charArray[i] = charList.get(i);
        }

        return charArray;
    }

    // Author requires us to work on the original string.
    // Just stupid extra work which is not actually interesting at all.
    public int compress(char[] chars) {

        ArrayList<Character> res = new ArrayList<Character>();
        int compressFactor = 0;

        char currentChar = chars[0];
        compressFactor = 1;

        for(int i = 1 ; i < chars.length ; ++i) {
            if(chars[i] == currentChar) {
                compressFactor += 1;
            }
            else {
                res.add(currentChar);
                if(compressFactor > 1) {
                    char[] conversion = numberToCharArray(compressFactor);
                    for(int j = 0 ; j < conversion.length; ++j) {
                        res.add(conversion[j]);
                    }
                }
                currentChar = chars[i];
                compressFactor = 1;

            }
        }

        res.add(currentChar);
        if(compressFactor > 1 ) {
            char[] conversion = numberToCharArray(compressFactor);
            for(int j = 0 ; j < conversion.length; ++j) {
                res.add(conversion[j]);
            }
        }

        for(int i = 0 ; i < res.size(); ++i) {
            chars[i] = res.get(i);
        }

        return res.size();
    }
}