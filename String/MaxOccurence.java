package Strings;

import java.util.HashMap;
import java.util.Map;
public class MaxOccurence {
    public char maxOccurence(String s){
        s = s.replaceAll("\\s","");
        Map<Character,Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char ch: arr){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int max = 0;
        char c = ' ';
       for(Map.Entry<Character,Integer> i : hm.entrySet()){
           if(max < i.getValue()){
               max = i.getValue();
               c = i.getKey();
           }
       }
       return c;
    }
    public static void main(String[] args) {
        System.out.println(new MaxOccurence().maxOccurence("S an jay"));
    }
}
