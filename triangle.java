// Problem 1
/*
      *
     **
    ***
   ****
  *****


public class triangle {
    public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++){
           //inner loop for space
           for(int j=1; j<=n-i;j++){
               System.out.print(" ");

           }
           //inner loop for star
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
        }

    }
*/
// Problem 2
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5


public class triangle{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
*/

// Problem 3

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

public class triangle{
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}




