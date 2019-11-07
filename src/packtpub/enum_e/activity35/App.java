package packtpub.enum_e.activity35;

public enum App {
    BE("BACHELOR OF ENGINEERING", 1),
    BCOM("BACHELOR OF COMMERCE", 2),
    BSC("BACHELOR OF SCIENCE", 3),
    BARC("BACHELOR OF ARCHITECTURE", 4);

    private String acronym;
    private int deptNum;

    App(String acronym, int deptNum) {
        this.acronym = acronym;
        this.deptNum = deptNum;
    }

    public String getAcronym() {
        return acronym;
    }

    public int getDeptNum() {
        return deptNum;
    }

    public static boolean isFound(String answer) {
        boolean found = false;
        for (App dept : App.values()) {
            if (answer.equalsIgnoreCase(dept.name())) {
                found = true;
                break;
            }
        }
        return found;
    }
}
