public class ClassCount{
    public static void main(String[] args){
        int count = 0;
        int temp = 0;
        int[][] arr = {{1,0,3},{0,5,6},{7,8,9}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 0){
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
        