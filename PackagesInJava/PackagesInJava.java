package PackagesInJava;

import PackagesInJava.tools.AdvCalc;

public class PackagesInJava {

    public static void main(String[] var0) {
        AdvCalc var1 = new AdvCalc();
        int var2 = var1.add(10, 20);
        int var3 = var1.sub(7, 3);
        int var4 = var1.multiple(5, 3);
        int var5 = var1.divide(10, 4);
        System.out.println(var2 + "  " + var3 + "  " + var4 + "  " + var5);
    }
}
