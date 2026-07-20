class Solution {
    public int subtractProductAndSum(int n) {
        int originaln=n;
        int sum=0;
        int product =1;
        int result =0;
        while(n>0){
            int digit=n%10;
            product=product*digit;
           n=n/10;
        }

        n=originaln;
        while(n>0){
            int digit=n%10;
           sum=sum+digit;
           n=n/10;
        }
     result=(product-sum);
     return result;
    }
}