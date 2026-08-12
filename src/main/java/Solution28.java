class Solution28 {
    private int[] prefix_array(String pattern) {

        int[] prefix = new int[pattern.length()];

        int k = 0;
        for(int q = 1 ; q < pattern.length(); ++q){

            while(k > 0 && pattern.charAt(k) != pattern.charAt((q))){
                k = prefix[k - 1];
            }

            if (pattern.charAt(k)  == pattern.charAt(q)){
                k += 1;
            }
            prefix[q] = k;
        }

        return prefix;
    }


    public int matchStr(String haystack, String needle, int[] prefix) {

        int k=0,j=0;

        for(k = 0 ; k < haystack.length(); ++k){
            while(j > 0 && haystack.charAt(k) != needle.charAt(j)){
                j = prefix[j - 1];
            }
            if(haystack.charAt(k) == needle.charAt(j)){
                j  += 1;
            }
            if(j == needle.length()){
                return k - needle.length() + 1;
            }
        }
        return -1;
    }

    public int strStr(String haystack, String needle) {
        int[] prefix_array = prefix_array(needle);
        return matchStr(haystack,needle,prefix_array);
    }
}