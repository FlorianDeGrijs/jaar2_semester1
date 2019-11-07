package packtpub.exceptions.chaining;

public class MainChaining {

    private static int parseUsersAge(String ageString) {
        return Integer.parseInt(ageString);
    }

    private static void readUserInfo() throws Exception{
        try {
            int age = parseUsersAge("fifty five");
        } catch (NumberFormatException e) {
            throw new Exception("Problem while parsing user's age", e);
        }

    }

    public static void main(String[] args) throws Exception {
        readUserInfo();
    }
}
