package recursion.basic;

public class ConvertDecimalToBinary
{
    public static void main(String[] args) {
        convertDecimalToBinary(10);
    }

    private static void convertDecimalToBinary(int number) {
        if(number==0)
            return;
        convertDecimalToBinary(number/2);
        System.out.print(number%2);
    }
}
