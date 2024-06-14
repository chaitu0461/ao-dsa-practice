package recursion.basic;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("abc",0);
    }

    private static void reverseString(String name, int index) {
        if(index==name.length())
            return;
        reverseString(name,index+1);
        System.out.print(name.charAt(index));
    }
}
