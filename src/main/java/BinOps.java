public class BinOps {
    public String sum(String a, String b) {
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        String result = Integer.toBinaryString(arg0 + arg1);
        return result;
    }

    public String mult(String a, String b) {
        int arg0 = Integer.parseInt(a, 2);
        int arg1 = Integer.parseInt(b, 2);
        String result = Integer.toBinaryString(arg0 * arg1);
        return result;
    }
}