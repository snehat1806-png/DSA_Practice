class Solution {
    public int numberOfSteps(int num) {
        return fun(num,0);
    }
    public int fun(int num,int step){
        //base condition 
        if(num==0){
            return step;
        }
       if(num%2==0){
        num=num/2;
        step=step+1;
        return fun(num,step);
       }else{
        num=num-1;
        step=step+1;
        return fun(num,step);
       }
}
}