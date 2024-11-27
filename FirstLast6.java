package JavaBasicCodes;

public class FirstLast6 {
    public static void main(String[] args) {
        FirstLast6 task = new FirstLast6();
        System.out.println(task.firstLast6(new int[]{1, 2, 6}));
        System.out.println(task.firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(task.firstLast6(new int[]{13, 6, 1, 2, 3}));


    }

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
