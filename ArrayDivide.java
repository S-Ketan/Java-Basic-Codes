package JavaBasicCodes;

public class ArrayDivide {
    public static void main(String[] args) {
        ArrayDivide ad=  new ArrayDivide();
        int[] example1 = {1, 2, 3, 3,3};  // true: [1,2,3] und [3]
        int[] example2 = {1, 1, 1, 2, 1};  // true: [1,1,1] und [2,1]
        int[] example3 = {2, 1, 1, 2, 1};  // false

        System.out.println(ad.canDivideArray(example1));
        System.out.println(ad.canDivideArray(example2));
        System.out.println(ad.canDivideArray(example3));
    }
    public boolean canDivideArray(int [] nums){
        int totalSum=0;
            int leftSum=0;
            int rightSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            rightSum=totalSum-leftSum;
            if(leftSum==rightSum){
                return true;
            }

        }

        return false;
    }
}
