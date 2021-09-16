package Q1FizzOrBazz;

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
             if(chechultiple(5,i) && chechultiple(3,i)){
                 list.add("fizzBazz");
             }else if (chechultiple(5,i)){
                 list.add("bazz");
             }else if(chechultiple(3,i)){
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