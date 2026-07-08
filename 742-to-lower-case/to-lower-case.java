class Solution {
    public String toLowerCase(String s) {
    //    s=s.toLowerCase();
    //    return s; 
    char [] arr=s.toCharArray();//convert string to char 
    for(int i=0;i<arr.length;i++){
         if(arr[i]>='A'&&arr[i]<='Z'){
           arr[i]=(char)(arr[i]+32); 
    }
    }
    return new String(arr);
}}