package JavaBasicCodes;

public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int count=0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]==9){count++;}
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayCount9 arrayCount9 = new ArrayCount9();
        System.out.println( arrayCount9.arrayCount9(new int[]{1,9,9}));
        System.out.println( arrayCount9.arrayCount9(new int[]{1,9,19}));
        System.out.println( arrayCount9.arrayCount9(new int[]{1,1,1}));
    }
}
