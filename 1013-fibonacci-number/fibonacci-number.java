class Solution {
    public int fib(int n) {

        // Base conditions
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }
        int a=0;
        int b=1;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    
    }
}