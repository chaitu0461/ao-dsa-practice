package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroesBetterApproach {
    public static void main(String[] args) {
        List<List<Integer>> matrix= new ArrayList<>();
        matrix.add( Arrays.asList(1,1,1));
        matrix.add(Arrays.asList(1,0,1));
        matrix.add(Arrays.asList(1,1,1));
        System.out.print("-----matrix before----");
        for(int i=0;i<matrix.size();i++){
            System.out.println();
            for(int j=0;j<matrix.get(0).size();j++){
                System.out.print(matrix.get(i).get(j)+" ");
            }
        }
        System.out.println();
        System.out.print("-----matrix after----");

        setMatrixZeroes(matrix);

        for(int i=0;i<matrix.size();i++){
            System.out.println();
            for(int j=0;j<matrix.get(0).size();j++){
                System.out.print(matrix.get(i).get(j)+" ");
            }
        }

    }

    private static void setMatrixZeroes(List<List<Integer>> matrix) {
        int[] rows=new int[matrix.size()];
        int[] columns= new int[matrix.get(0).size()];
        for(int i=0;i< rows.length;i++){
            for(int j=0;j<columns.length;j++){
                if(matrix.get(i).get(j)==0){
                    rows[i]=1;
                    columns[j]=1;
                }
            }
        }
        for(int i=0;i< rows.length;i++){
            for(int j=0;j< columns.length;j++){
                if(rows[i]==1||columns[j]==1){
                    matrix.get(i).set(j,0);
                }
            }
        }
    }
}
