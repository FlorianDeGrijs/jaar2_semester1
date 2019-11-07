package packtpub_algorithms_datastructures.binary;

public class MainBinary {

    private static int convertToDecimal(String binary) {
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1') {
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = convertToDecimal("110001");
        System.out.println(a);
    }
}
