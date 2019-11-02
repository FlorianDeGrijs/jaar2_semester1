package lambda.packtpub;

public class MainPacktPub {

    private static String convert(Integer i, Conversion c) {
        return c.convert(i);
    }

    public static void main(String[] args) {
        Integer i = 5;
        Integer ii = 2;
        String s = convert(i, num -> String.valueOf(i));
        String c = convert(ii, String::valueOf);
        System.out.println(c);
    }
}
