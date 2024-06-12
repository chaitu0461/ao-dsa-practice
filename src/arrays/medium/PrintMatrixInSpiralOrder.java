package arrays.medium;

public class PrintMatrixInSpiralOrder {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
       int topRow=0;
       int rightColumn=matrix[0].length-1;
       int bottomRow=matrix.length-1;
       int leftColumn=0;
       int numOfElementsPrinted=0;
       int totalElements=matrix.length*matrix[0].length;
       while (numOfElementsPrinted<totalElements){
           //top row->leftColumn to rightColumn
           for(int i=leftColumn;i<=rightColumn && numOfElementsPrinted<totalElements;i++){
               System.out.print(matrix[topRow][i]+" ");
               numOfElementsPrinted++;
           }
           topRow++;
           //right column -> toprow to bottom row
           for(int i=topRow;i<=bottomRow && numOfElementsPrinted<totalElements;i++){
               System.out.print(matrix[i][rightColumn]+" ");
               numOfElementsPrinted++;
           }
           rightColumn--;

           //bottom row-> rightColumn to leftColumn
           for(int i=rightColumn;i>=leftColumn && numOfElementsPrinted<totalElements;i--){
               System.out.print(matrix[bottomRow][i]+ " ");
               numOfElementsPrinted++;
           }
           bottomRow--;
           //leftColumn -> bottomrow to top row

           for(int i=bottomRow ;i>=topRow && numOfElementsPrinted<totalElements ;i-- ){
               System.out.print(matrix[i][leftColumn]+ " ");
               numOfElementsPrinted++;
           }
           leftColumn++;

       }
    }
}
