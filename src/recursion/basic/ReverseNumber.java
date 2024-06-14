package recursion.basic;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(123);
    }

    private static void reverse(int number) {
        if(number==0)
            return;
        System.out.print(number%10);
        reverse(number/10);
    }
}
