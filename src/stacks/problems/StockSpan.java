package stacks.problems;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] stockPrices={100,80,60,70,60,75,85};
        Stack<Pair> pairStack=new Stack<>();
        int[] ans=new int[stockPrices.length];
        ans[0]=1;
        pairStack.push(new Pair(0,stockPrices[0]));
        for(int i=1;i< stockPrices.length;i++){
            while (!pairStack.isEmpty() &&pairStack.peek().value<stockPrices[i]){
                pairStack.pop();
            }
            if(pairStack.isEmpty()){
                ans[i]=i+1;
            }
            else
                ans[i]=i-pairStack.peek().index;
            pairStack.push(new Pair(i,stockPrices[i]));
        }
        Arrays.stream(ans).forEach(System.out::println);
    }
   static class Pair{
        int index;
        int value;

        public Pair(int index, int value) {
            this.value = value;
            this.index = index;
        }
    }
}
