
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
public class Solution22 {
    
    public List<String> collectWithLength(List<String> list , String s, int open, int closed , int target){
        if(target == open && open == closed){
            list.add(s);
        }
        if(open < target){
        collectWithLength(list,s + '(',open+1,closed,target);
        }
        if(open > closed) {
            collectWithLength(list,s + ')',open,closed+1,target);
        }
        return list;
    }
    
    public List<String> generateParenthesis(int n) {
        
        ArrayList arr = new ArrayList();
        StringBuffer sb = new StringBuffer("");
        
        if(n == 0){
            arr.add(sb);
            return arr;
        }
        
        return collectWithLength(arr, "",0,0,n);
        
    }
}