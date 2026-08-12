import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution1732 {
    public int largestAltitude(int[] gain) {

        ArrayList<Integer> pSum = new ArrayList<Integer>(Collections.nCopies(gain.length, 0));

        pSum.set(0, gain[0]);
        for(int i = 1 ; i < gain.length ; ++i) {
            pSum.set(i, pSum.get(i-1) + gain[i]);
        }

        int max = 0;
        for(int i = 0 ; i < gain.length ; ++i) {
            if(pSum.get(i) > max) {
                max = pSum.get(i);
            }
        }
        return max;
    }
}