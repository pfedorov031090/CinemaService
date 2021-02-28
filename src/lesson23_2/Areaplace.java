package lesson23_2;

public enum Areaplace {
    FREE("|_|"), OCCUPIED("|*|");

    private String str;

    Areaplace(String str) {
        this.str = str;
    }

    public String getStr () {
        return str;
    }
}
