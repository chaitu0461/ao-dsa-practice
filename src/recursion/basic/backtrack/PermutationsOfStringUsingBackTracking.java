package recursion.basic.backtrack;

public class PermutationsOfStringUsingBackTracking {
    public static void main(String[] args) {
        permute("abc".toCharArray(),0);
    }

    private static void permute(char[] charArray, int fixedIndex) {
        if(fixedIndex==charArray.length)
            System.out.println(charArray);
        for(int i=fixedIndex;i<charArray.length;i++){
            swap(fixedIndex,i,charArray);
            permute(charArray,fixedIndex+1);
            swap(fixedIndex,i,charArray);
        }
    }

    private static void swap(int fixedIndex, int i, char[] charArray) {
        char temp=charArray[fixedIndex];
        charArray[fixedIndex]=charArray[i];
        charArray[i]=temp;
    }
}
