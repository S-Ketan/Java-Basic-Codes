package JavaBasicCodes;

public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int loopEnd=0;
        if(nums.length<4){loopEnd=nums.length-1;}
        else{loopEnd=3;}

        for(int i=0; i<=loopEnd;i++){
            if(nums[i]==9){return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayFront9 arrayFront9 = new ArrayFront9();
        System.out.println( arrayFront9.arrayFront9(new int[]{1,9,9,3,9}));
        System.out.println( arrayFront9.arrayFront9(new int[]{1,9,19,3,9}));
        System.out.println( arrayFront9.arrayFront9(new int[]{1,1,1}));
    }
}
