
public class LastOccurence {
    int occurence(int arr[]) {
        int n = 85;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                ans = i;
            }

        }
        return ans;

    }

    public static void main(String[] args) {

        int arr[]={1,3,2,3,2,4,5,3,4,5,6,3};

        LastOccurence obj=new LastOccurence();
        System.out.println(obj.occurence(arr));

    }



}
