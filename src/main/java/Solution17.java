
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
public class Solution17 {
    
    
        String[][] letters = {{},{},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},
                        {"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
    
        private List<String> combineLetter(String combination){
            int num = Character.getNumericValue(combination.charAt(0));
            String[] all_letters = letters[num];
            
            if(combination.length() == 1){
                return Arrays.asList(all_letters);
            } else{
                List<String> future_chars = this.combineLetter(combination.substring(1));
                
                List<String> results = new ArrayList();
                
                for(int i = 0 ; i < all_letters.length ; ++i){
                    for(int j = 0 ; j < future_chars.size(); ++j){
                        String tmp = all_letters[i].concat(future_chars.get(j));
                        results.add(tmp);
                    }
                }
                
                return results;
            }
            
        }
    
        public List<String> letterCombinations(String digits) {
            
            
            if(digits.length() > 0){
                List<String> result = this.combineLetter(digits);
                return result;

            }
            else{
                return Arrays.asList();
            }
        }
    
}
