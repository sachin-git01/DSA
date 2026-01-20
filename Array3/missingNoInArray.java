// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//          int smallest=0;
//          for(int i=0;i<nums.length;i++){
//                     if(nums[i]==smalles){
//                        smallest++;
//                     }
//          }
//          return smallest;               // my way
//     }
// }


sum method fisrt array kA SUM  then total by sum of first n natural number then total-sum
  class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       int sum=0;
       for(int x:nums){
        sum+=x;
       }
   
      
        int  total=(n*(n+1)/2);


       return total-sum;
      
    }



3ra method

  
  class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
       
         for(int i=0;i<nums.length;i++){
                    if(nums[i]!=i){
                       return i;
                    }
         }
         return nums.length;
    }
}
}
