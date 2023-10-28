public class LogicalOperations {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);

        int x = 5;
        int y = 10;
        int result = (x < y) ? x : y;
        System.out.println("Минимум из x и y: " + result);

        int num1 = 12; // 1100 в двоичной системе
        int num2 = 9;  // 1001 в двоичной системе
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        int notResult = ~num1;
        System.out.println("num1 & num2 = " + andResult);
        System.out.println("num1 | num2 = " + orResult);
        System.out.println("num1 ^ num2 = " + xorResult);
        System.out.println("~num1 = " + notResult);

        int num3 = 16; // 10000 в двоичной системе
        int rightShift = num3 >> 2;
        int leftShift = num3 << 1;
        int logicalRightShift = num3 >>> 2;
        System.out.println("num3 >> 2 = " + rightShift);
        System.out.println("num3 << 1 = " + leftShift);
        System.out.println("num3 >>> 2 = " + logicalRightShift);
    }
}
