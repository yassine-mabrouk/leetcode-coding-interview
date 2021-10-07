package arrays.twoSum;

public class Demo {
    public static void main(String[] args) {
        System.out.println("data demo ");
        Solution sol=new Solution();
        int []tab=new int[4];
        tab[0]=1;
        tab[1]=2;
        tab[2]=3;
        tab[3]=7;
      //  sol.afficher(tab);
        sol.afficher(sol.twoSum(tab,3));
    }
}
