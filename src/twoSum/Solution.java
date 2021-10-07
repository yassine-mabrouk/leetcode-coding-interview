package twoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
       int [] result = new int[2];
       for (int i=0;i<nums.length;i++){
           for (int j=0 ;j<nums.length;j++){
               if (nums[i]+nums[j]==target){
                   result[0]=i;
                   result [1]=j;
                   return result;
               }
           }
       }
    return   null;
    }
    public  void afficher(int [] tab){
        if(tab==null) System.out.println("le tab est vide ");
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]+"\t");
        }
    }
}
