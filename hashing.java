import java.util.HashMap;
public class hashing{
    public static void main(String[] args) {
        String str = "ram kumar";
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i =0; i<str.length(); i++){
            char singlechar = str.charAt(i);
            if (map.get(singlechar)==null){
                map.put(singlechar,1);
            }
            else{
                int count =map.get(singlechar);
                map.put(singlechar,count+1);
            }
        }
        System.out.println(map);
    }
}
