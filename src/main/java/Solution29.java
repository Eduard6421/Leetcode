class Solution29 {
    public int divide(int int_dividend, int int_divisor) {

        long dividend = (long) int_dividend;
        long divisor = (long) int_divisor;

        int sign = (int)((dividend>>31) ^ (divisor>>31));

        if(dividend < 0){
            dividend = ~dividend + 1;
        }
        if(divisor < 0){
            divisor = ~divisor + 1;
        }
        long result = 0;

        while(dividend >= divisor) {
            long current_num = divisor;
            long to_add = 1;
            for(;current_num < dividend ; current_num<<=1, to_add<<=1);
            if(current_num > divisor){
                current_num >>=1 ;
                to_add >>=1;
            }
            result = result + to_add;
            dividend -= current_num;

        }

        if(sign < 0 ){
            result = (~result) + 1;
        }
        if(result > Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }
        return (int)result;

    }
}