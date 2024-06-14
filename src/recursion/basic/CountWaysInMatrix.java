package recursion.basic;

public class CountWaysInMatrix {
    public static void main(String[] args) {
        int[][] two_d=new int[2][2];
        int numberOfWays=countWays(two_d,0,0);
        System.out.print(numberOfWays);
    }

    private static int countWays(int[][] twoD,int curRow,int curColumn) {
        if(curRow>=twoD.length || curColumn>=twoD.length){
            return 0;
        }
        if(curRow==twoD.length-1 && curColumn==twoD[0].length-1){
            return 1;
        }
        int noOfWaysMovingRight=countWays(twoD,curRow,curColumn+1);
        int noOfWaysMovingDown=countWays(twoD,curRow+1,curColumn);
        return noOfWaysMovingRight+noOfWaysMovingDown;



    }
}
