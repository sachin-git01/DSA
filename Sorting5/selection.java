class Solution {
    void selectionSort(int[] arr) {
        // code here
         for(int i=0;i<arr.length;i++){
             int smallest=i;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[smallest]){
                  int temp=arr[j];
                  arr[j]=arr[smallest];
                  arr[smallest]=temp;
                  
                 }
             }
             
         }
    }
}
