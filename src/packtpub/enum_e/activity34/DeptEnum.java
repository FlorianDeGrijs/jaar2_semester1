package packtpub.enum_e.activity34;

public enum DeptEnum {
    BE("BACHELOR OF ENGINEERING", 1),
    BCOM("BACHELOR OF COMMERCE", 2),
    BSC("BACHELOR OF SCIENCE", 3),
    BARCH("BACHELOR OF ARCHITECTURE", 4),
    DEFAULT("BACHELOR", 0);

    private int deptNum;
    private String acronym;

    DeptEnum(String acronym, int deptNum) {
        this.deptNum = deptNum;
        this.acronym = acronym;
    }

    public int getDeptNum() {
        return deptNum;
    }

    public String getAcronym() {
        return acronym;
    }
}

