package recursion.backtrack;

public class GenerateParanthresis {
    public static void main(String[] args) {
        generateParanthresis(0,0,6,"");
    }

    private static void generateParanthresis(int openCount, int closedCount, int targetLength, String answerSoFar) {
        if(answerSoFar.length()==targetLength){
            System.out.println(answerSoFar);
            return;
        }
        if(openCount<targetLength/2)
         generateParanthresis(openCount+1,closedCount,targetLength,answerSoFar+"(");
        if(openCount>closedCount)
            generateParanthresis(openCount,closedCount+1,targetLength,answerSoFar+")");
    }
}
