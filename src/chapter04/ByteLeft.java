package chapter04;

class ByteLeft {
    public static void showByteLeft() {
        int b = 1;
        for (int i = 0; i < 8; i++) {
            b = (byte) (b << 1);
            System.out.println(b);
        }
    }
}
