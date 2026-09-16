public class MultiLevelInheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 = obj.add(10, 20);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multiple(5, 3);
        int r4 = obj.divide(10, 4);
        double r5 = obj.power(4, 2);

        System.out.println(r1 + "  " + r2 + "  " + r3 + "  " + r4 + " " + r5);
    }
}