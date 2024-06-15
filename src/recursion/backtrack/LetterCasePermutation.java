package recursion.backtrack;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String question="a1b2";
        permuteLetterCase(question,0,"");
    }

    private static void permuteLetterCase(String question, int index, String answer) {

        if(answer.length()==question.length()){
            System.out.println(answer);
            return;
        }
        if(!Character.isLetter(question.charAt(index))){
            permuteLetterCase(question,index+1,answer+question.charAt(index));
        }
        else {
            char alphabet=question.charAt(index);
            String modifiedAlphabet=null;
            if(alphabet>=65 && alphabet<=90){ //uppercase
              modifiedAlphabet=  Character.toString(alphabet).toLowerCase();
            }
            else //lower case
                modifiedAlphabet=Character.toString(alphabet).toUpperCase();
            permuteLetterCase(question,index+1,answer+modifiedAlphabet);
            permuteLetterCase(question,index+1,answer+alphabet);
        }
    }
}
