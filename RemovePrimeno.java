package Revision;

import java.util.ArrayList;

public class RemovePrimeno {

    public static boolean isPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> removePrime(ArrayList<Integer> l){
        for (int i = l.size()-1; i >= 0; i--){
            if(isPrime(l.get(i))){
                l.remove(i);                        // it is must to remove element from last
            }
        }
        return l;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0,21);
        l.add(1,13);
        l.add(2,42);
        l.add(3,3);
        System.out.println(l);
        RemovePrimeno.removePrime(l);
        System.out.println(l);
    }
}
