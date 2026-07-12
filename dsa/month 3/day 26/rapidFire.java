public class rapidFire {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        //reverse 
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;

        }
        System.out.println("reversed array");
        for (int i : arr) {
            System.out.println(i);
        }
        //find pair
        System.out.println("sorted array pair sum=target");
        int[] nums={2,7,11,15};
        int target=9;
        l=0;
        r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]<target){
                l++;
            }else if(nums[l]+nums[r]>target){
                r--;
            }else{
                System.out.println(nums[l]+","+nums[r]);
                break;
            }
        }
        //maxsum of subarray k=3
        int[] array={1,2,3,4,5};
        int k=3;
        int sum=0;
        int maxsum=0;//minvalue can be use

        for (int i = 0; i < k; i++) {
            sum+=array[i];
        }
        if(sum>maxsum) maxsum=sum;

        for (int i = k; i < array.length; i++) {
            sum-=array[i-k];
            sum+=array[i];
            if(sum>maxsum) maxsum=sum;
        }
        System.out.println(maxsum);

    int[] subarray={1,-2,3,4,-1,5};
    int sums=0;
    int maxsums=Integer.MIN_VALUE;
    for(int i=0;i<subarray.length;i++){
        sums+=subarray[i];
        if(maxsums<sums) maxsums=sums;
        if(sums<0) sums=0;
    }
    System.out.println(maxsums);



    } 
}
