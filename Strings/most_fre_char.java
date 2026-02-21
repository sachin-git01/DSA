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





        // best tc




        class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
    int fre[]=new int[26];
    for(char c : s.toCharArray()){
        fre[(c-'a')]++; //freq is counted
    }
    int maxfre=0;
    for(int maxx :fre){
        maxfre=Math.max(maxx,maxfre);
        // max fre
    }
    
    for(int i=0;i<26;i++){
        if(fre[i]==maxfre){
            return (char)(i+'a');
        }
    }
      return 'a';
      
    }
}
    
        
    }
}
