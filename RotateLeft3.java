package JavaBasicCodes;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int firstElement=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];

        }
        nums[nums.length-1]=firstElement;
        return nums;
    }

}
