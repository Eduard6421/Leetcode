class Solution151 {



    private StringBuilder reverseString(String s){

        StringBuilder sb = new StringBuilder();

        for(int i = s.length() - 1 ; i >=0 ; --i){
            sb.append(s.charAt(i));
        }

        return sb;
    }
    public String reverseWords(String s) {


        s = s.trim();
        StringBuilder sb = reverseString(s);


        int lastIndex = 0;
        // Go through the entire string
        for(int i = 0 ; i < sb.length(); ++i){

            //If we find a lot of whitespace. Just add once and skip over it all.
            if(sb.charAt(i) == ' '){
                sb.setCharAt(lastIndex, ' ');
                lastIndex++;
            }
            for(;i < sb.length() && sb.charAt(i) == ' '; ++i);

            // Go to the end of currently discovered word
            int j;
            for(j=i; j < sb.length() && sb.charAt(j) != ' '; ++j){}
            --j;

            // Reverse the whole string
            // Copy it at lastIndex position, reversed
            for(int start = i,end = j; start < end; start++, end--){
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
            }

            for(int start = i, end = j; start <= end ; start++){
                sb.setCharAt(lastIndex, sb.charAt(start));
                if(start != lastIndex){
                    sb.setCharAt(start, ' ');
                }
                lastIndex++;
            }

            i = j;
        }



        return sb.toString().trim();
    }
}