public class MultiDimentionalArraysInJava {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        // Will Generate Some Random Numbers to store in Array
        for (int i=0; i<3; i++) {
            for (int j=0;j<4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0;j<4; j++) {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }

        // Will ALso use a Enhanced For Loop to Print the Same Array.

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + "  ");
            }
            System.out.println();
        }
    }
}