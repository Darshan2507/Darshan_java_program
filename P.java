class p {
    public static void main(String[] args) {
        short x = 6;
        int y = 4;
        float a = 12.5f;
        float b = 7.2f;
        System.out.println("x is" + x + " y is " + y);
        System.out.println("x + y ="+ (x + y));
        System.out.println("x - y ="+(x - y));
        System.out.println("x / y ="+(x / y));
        System.out.println("x % y ="+(x % y));

        x=-6;
        System.out.println("x % y ="+(x % y));
        y=-4;
        System.out.println("x % y ="+(x % y));
        x=6;
        y=-4;
        System.out.println("x % y ="+(x % y));


        System.out.println("a is"+ a + "b is" + b);
        System.out.println("a / b ="+(a / b));
        System.out.println("a / x ="+(a / x));
        System.out.println("a % x ="+(a % x));
        System.out.println("a % b ="+(a % b));

    }
}