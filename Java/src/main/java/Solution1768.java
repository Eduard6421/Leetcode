public  class Solution1768 {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int minLength = Math.min(word1.length(), word2.length());
        int maxLength = Math.max(word1.length(), word2.length());

        String largerString = word1.length() > word2.length() ? word1 : word2;

        for(int i = 0 ; i < minLength; ++i){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        for(int i = minLength; i < maxLength; ++i){
            sb.append(largerString.charAt(i));
        }

        return sb.toString();
    }
}