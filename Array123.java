package JavaBasicCodes;

public class Array123 {
    public boolean array123(int[] nums) {
        if(nums.length>3){
            for(int i=0;i<nums.length-2;i++){
                if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                    return true;
                }
            }
        }
        else if(nums.length==3 && (nums[0]==1 && nums[1]==2 && nums[2]==3)){return true;}
        return false;


    }

    public static void main(String[] args) {
        Array123 a123 = new Array123();
        System.out.println(a123.array123(new int[]{1,2,3}));
        System.out.println(a123.array123(new int[]{1,2,1}));
        System.out.println(a123.array123(new int[]{1,2,1,3}));
        System.out.println(a123.array123(new int[]{1,2,1,3,4}));
    }
}
