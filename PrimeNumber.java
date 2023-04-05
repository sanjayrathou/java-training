
// if cosider 1 is not prime.

import java.util.*;

public class PrimeNumber{

   public static void main(String[] args){
   
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter the number :");
   int n = sc.nextInt();
   int count = 0;

   for(int i = 1; i <= n; i++ ){

    
      if(n % i == 0){
        count++;
      }
    
   }
   if(count == 2){
    System.out.println("prime");
   }
   else{
    System.out.println("not prime");

   }
}
}
