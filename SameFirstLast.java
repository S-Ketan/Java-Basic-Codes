package JavaBasicCodes;

public class SameFirstLast {
    public static void main(String[] args) {
        SameFirstLast task = new SameFirstLast();
        System.out.println(task.sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(task.sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(task.sameFirstLast(new int[]{1, 2, 1}));
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }
    
}
