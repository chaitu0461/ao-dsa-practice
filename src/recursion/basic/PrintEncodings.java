package recursion.basic;

public class PrintEncodings {
    public static void main(String[] args) {
        String question="103";
        String[] numEncoding={" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        printAllPossibleEncodings(question,"",numEncoding);
    }

    private static void printAllPossibleEncodings(String question, String ans, String[] numEncoding) {

        if(question.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<question.length();i++){

            int choosenNumber=Integer.parseInt(question.substring(0,i+1));
            if( choosenNumber==0)
                return;
            if(  choosenNumber<numEncoding.length ){
                printAllPossibleEncodings(question.substring(i+1),ans+numEncoding[choosenNumber],numEncoding);
            }



        }
    }
}
