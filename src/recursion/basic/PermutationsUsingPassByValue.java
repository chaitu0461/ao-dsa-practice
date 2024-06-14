package recursion.basic;public class PermutationsUsingPassByValue {
    public static void main(String[] args) {
        permute("abc","");
    }

    private static void permute(String originalString, String ans) {
        if(originalString.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<originalString.length();i++){
            char ch=originalString.charAt(i);
            String leftPart=originalString.substring(0,i);
            String rightPart=originalString.substring(i+1);
            String remainingString=leftPart+rightPart;
            ans=ans+ch;
            permute(remainingString,ans);
        }
    }
}
