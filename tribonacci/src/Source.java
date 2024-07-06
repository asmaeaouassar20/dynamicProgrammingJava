import java.util.HashMap;

public class Source {

    public static int tribonacci(int n){
        // base case
        if(n==0 || n==1) return 0;

        // base case
        if(n==2) return 1;

        // recursive case
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }


    // ------------------  add memoization  ---------------------------------------


    public static  int tribonacci2(int n){
        // call the helper function with empty HashMap to start memoization
        return tribonacci2(n,new HashMap<>());
    }

    public static int tribonacci2(int n, HashMap<Integer,Integer> memo){

        // base case
        if(n==0 || n==1) return 0;

        // base case
        if(n==2) return 1;

        // if the value for n is already calculated and stored in the memo, return it
        if(memo.containsKey(n)) return memo.get(n);

        // recursive case : calculate the tribonacci value for n
        int result=tribonacci2(n-1,memo)+tribonacci2(n-2,memo)+tribonacci2(n-3,memo);;

        // store the calculated result in the memo for future reference
        memo.put(n,result);


        return result;
    }

    public static void main(String[] args) {
    }
}