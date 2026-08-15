class Solution392 {
    public boolean isSubsequence(String s, String t) {

        int templatePointer = 0 ;

        if(s.length() == 0) {
            return true;
        }
        if(t.length() == 0) {
            return false;
        }

        for(int i = 0 ; i < t.length() ; ++i) {
            if(t.charAt(i) == s.charAt(templatePointer)){
                templatePointer +=1 ;
                if(templatePointer == s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}