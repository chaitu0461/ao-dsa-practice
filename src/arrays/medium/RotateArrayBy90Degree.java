package arrays.medium;

public class RotateArrayBy90Degree {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        traspose(matrix,matrix.length,matrix[0].length);
        rotate(matrix,matrix.length);
        System.out.println(matrix);
    }

    private static void rotate(int[][] matrix,int rows) {
        for(int i=0;i<rows;i++ ){
            int [] row=matrix[i];
            int high=row.length-1;
            int low=0;
            while (low<high){
                int temp=row[low];
                row[low]=row[high];
                row[high]=temp;
                low++;
                high--;
            }
        }
    }

    private static void traspose(int[][] matrix,int rows,int columns) {
        for(int i=0;i<rows;i++){
            for(int j=i;j<columns;j++){
                if(i!=j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }
}
