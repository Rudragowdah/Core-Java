public class CreatingAnArrayInJava {
    public static void main(String[] args) {
        int num[] = {10, 20, 30};
//        System.out.println(num[1]); // Prints 20

        int nums[] = new int[4];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 20;

//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
        for (int i=0; i<4; i++) {
            System.out.println(nums[i]);
        }

    }
}