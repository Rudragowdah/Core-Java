public class Introduction {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();

        int r1 = obj.add(10, 20);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multiple(5, 3);
        int r4 = obj.divide(10, 4);

        System.out.println(r1 + "  " + r2 + "  " + r3 + "  " + r4);
    }
}