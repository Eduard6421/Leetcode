class Solution1071 {


    private int gcd(int a,int b) {
        int c = a % b;

        if(c == 0) return b;
        else {
            return gcd(b , c);
        }
    }

    public String gcdOfStrings(String str1, String str2) {


        String strConcat = str1 + str2;
        String reverseConcat = str2+ str1;

        if(!strConcat.equals(reverseConcat)){
            return "";
        }

        int gcd = gcd(str1.length(),str2.length());
        return str1.substring(0, gcd);
    }
}

