//today 2d array learning
public class pt1{
    public static void main(String[] args) {
        // for(int i=1;i<5;i++){
        //     for (int j = 1; j < i+1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        int[][] matrix={
            {1,2},
            {4,5,6},
            {7,8,9}
        };

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println();
        // }

        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }
        System.out.println(sum);

        sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(sum<matrix[i][j]) sum=matrix[i][j];
            }
        }
        System.out.println(sum);

        int even=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]%2==0) even++;
            }
        }
        System.out.println(even);

        int target=4;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==target) System.out.println(i+","+j);
            }
        }

    }
}
