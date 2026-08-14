/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
class Solution26 {
    public int removeDuplicates(int[] v) {
        
        int k = 1 ;
        for(int i = 1 ; i < v.length ; ++i) {
            if(v[i] != v[i-1]){
                v[k] = v[i];
                ++k;
            }
        }
        return k;
    }
}