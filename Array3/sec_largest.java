class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1;
        int sec=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>sec){
                sec=arr[i];
            }
        }
        return sec;
    }
}
