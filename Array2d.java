
public class Array2d{
    public static void main(String[] args){
    
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int ans ;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                ans = arr[i][j];
                System.out.println(ans);
            }     
        }
    }
}