import java.util.HashMap;
import java.util.List;

public class Source {

    // ------------  Brute force recursion  ----------------------------

    /**
     * Determines if it is possible to generate the given amount using the numbers in the list
     * @param amount the target amount to be generated
     * @param numbers the list of numbers that can be used to generate the amount
     * @return true if the amount can be generated, false otherwise
     */
    public static boolean sumPossible(int amount,List<Integer> numbers){
        // base case
        if(amount==0) return true;

        // base case
        if(amount<0) return false;

        //recursive case : generate the amount by subtracting each number in the list
        for(int num:numbers){
            int subAmout=amount-num;
            if(sumPossible(subAmout,numbers)) return true;
        }

        // if none of the numbers can generate the amount, return false
        return false;
    }






    // ------------  add memoization using a hashmap memo  ----------------------------
    public static boolean sumPossible2(int amount, List<Integer> numbers){
        return sumPossible2(amount,numbers,new HashMap<>());
    }


    // Helper method that uses memoization to determine if it is possible to generate the given amount
    // memo : is a hashmap to store previously computed results
        public static boolean sumPossible2(int amount, List<Integer> numbers, HashMap<Integer,Boolean> memo){
        if(amount==0) return true;

        if(amount<0) return false;

        // Check the memo to see if the result for the current amount has already computed
        if(memo.containsKey(amount)) return memo.get(amount);

        for(int num:numbers){
            int subAmount=amount-num;
            if(sumPossible2(subAmount,numbers,memo)){
                // if it is possible to generate the amount , store the result in the memo and return true
                memo.put(amount,true);
                return true;
            }
        }

        // if none of the numbers can generate the amount, store the result in the memo and return false
        memo.put(amount,false);
        return false;
    }






    public static void main(String[] args) {
    }
}