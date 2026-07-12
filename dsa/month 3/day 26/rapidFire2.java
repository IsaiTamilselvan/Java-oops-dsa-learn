public class rapidFire2 {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("main diagonal");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
        int colsum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                colsum+=matrix[j][i];
            }
            System.out.println(colsum);
            colsum=0;
        }

        int[] arr={5,1,9,2};
        int lar=Integer.MIN_VALUE;
        int secLar=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>lar){
                secLar=lar;
                lar=arr[i];
            }else if(arr[i]>secLar && arr[i]<lar){
                secLar=arr[i];
            }
        }
        System.out.println("Second largest:"+secLar);

        int[] array={1,2,3,4,5};

        //rotate entire array
        rotate(array,0,array.length-1);
        //rotate left
        rotate(array,0, 2);
        //rotate right
        rotate(array, 3,array.length-1);


        System.out.println("rotate array by 2");

        for (int i : array) {
            System.out.println(i);
        }

        //move zero to end

        System.out.println("move zero to end");
        int[] mixedarr={1,0,2,0,3};

        int left=0;
        int right=0;

        while (left<right) {
            while(mixedarr[left]==0 && mixedarr[right]!=0){
                int t=mixedarr[left];
                mixedarr[left]=mixedarr[right];
                mixedarr[right]=t;
                left++;
                right++;
            }
            while(mixedarr[right]==0) right++;
            while(mixedarr[left]!=0 && left<right) left++;
            
        }
        for (int i : mixedarr) {
            System.out.println(i);
        }




    }
    public static void rotate(int[] array,int l,int r){
        while(l<r){
            int temp=array[l];
            array[l]=array[r];
            array[r]=temp;
            l++;
            r--;
        }
    }
}
