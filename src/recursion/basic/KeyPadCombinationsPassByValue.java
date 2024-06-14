package recursion.basic;

public class KeyPadCombinationsPassByValue {
    public static void main(String[] args) {
        String question="12";
        String[] numCharMapping={"","abc","def","ghi","jkl","mnop","pqrs","tuv","wxyz"};
        printGivenKeyCombinations(question,numCharMapping,"");
    }

    private static void printGivenKeyCombinations(String question, String[] numCharMapping, String ans) {
        if(question.isEmpty()){
            System.out.println(ans);
            return;
        }

        int index=question.charAt(0)-'0';
        String stringForCurrentNumber=numCharMapping[index];
        for(int i=0;i<stringForCurrentNumber.length();i++){
            printGivenKeyCombinations(question.substring(1),numCharMapping,ans+stringForCurrentNumber.charAt(i));
        }
    }
}
