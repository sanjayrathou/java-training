public class LuckyNumber {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,3,5,3},{6,7,4,5}};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        for(int i = 0; i)
    }
}
