package Intergers.Q1FizzOrBazz;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static boolean chechultiple(int n, int val){
        return val%n==0;
    }
    public static void main(String[] args) {
        int n =15;
        List<String> list=new ArrayList<>();
         for(int i=1;i<=n;i++){
             if(i%5==0 && i%3==0){
                 list.add("fizzBazz");
             }else if (i%5==0){
                 list.add("bazz");
             }else if(i%3==0){
                 list.add("fizz");
             }else {
                 list.add(""+i);
             }
         }
        for (String str:list) {
            System.out.print(str+"\t");
        }
    }
}

//Notes:
// this code take O(n)