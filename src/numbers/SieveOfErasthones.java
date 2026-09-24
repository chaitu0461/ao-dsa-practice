package numbers;

import java.util.Arrays;

public class SieveOfErasthones {

  static void main() {
    int number = 100;
    boolean[] isComposite = new boolean[number+1];

    // We only need to find prime factors up to sqrt(limit).
    // If a number is composite, it must have at least one
    // factor <= sqrt(number).
    for(int currentNumber=2;currentNumber*currentNumber<=number;currentNumber++){

      // If candidate has not been marked composite,
      // then candidate must be prime.
      if(!isComposite[currentNumber]){

        /*
         * Mark all multiples of candidate as composite.
         *
         * Why start from candidate * candidate?
         *
         * Smaller multiples have already been marked
         * by smaller numbers.
         *
         * Example: candidate = 5
         *
         * 5 * 2 = 10 -> already marked by 2
         * 5 * 3 = 15 -> already marked by 3
         * 5 * 4 = 20 -> already marked by 2
         * 5 * 5 = 25 -> this is the first multiple
         *               that we need to mark using 5.
         *
         * Therefore, start from candidate * candidate.
         */
        for(int currentultiple=currentNumber*currentNumber;currentultiple<=number; currentultiple+=currentNumber){
          isComposite[currentultiple]=true;
        }
      }
    }
    for(int i=2;i<=number;i++){
      if(!isComposite[i]){
        System.out.println(i);
      }
    }
  }
}
