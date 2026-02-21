class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
    char []arr=s.toCharArray();
    Arrays.sort(arr);
    
     int count=0;
     int mxc=-1;
      char res=arr[0];
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
            count++;
            
        }
        else{
            count=0;
        }
        if(count>mxc){
            mxc=count;
           res=arr[i];
        }
    }
      
      return res; 
    
    
        
    }
}
