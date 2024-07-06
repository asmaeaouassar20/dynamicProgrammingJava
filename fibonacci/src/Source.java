import java.util.HashMap;


public class Source {


    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n){

        // Base case : F(0)=0 and F(1)=1
        if(n<=1) return n;

        // Recursive case
        return fibonacci(n-1)+fibonacci(n-2);
    }


    //------------------  Use memoization  ---------------------------------------------------------------------------
    // main method to calculate Fibonacci number with memoization
    public static int fib(int n){
        // Call the helper method with an empty HashMap for memoization
        return fib(n,new HashMap<>());
    }

    // Helper method that performs the actual fibonacci calculation with memoization
    public static int fib(int n,HashMap<Integer,Integer> memo){
        // base case: F(0)=0 and F(1)=1
        if(n<=1) return n;

        // Check if the result for n is already in the memoization map
        if(memo.containsKey(n)) return memo.get(n);

        // Calculate the Fibonacci number recursively and store the result in the memoization map
        int result=fib(n-1,memo)+fib(n-2,memo);
        memo.put(n,result);

        return result;
    }

    public static void main(String[] args) {
    }
}