package model.enums;

public enum Gender {
    MAN("man", "mężczyzna"),
    WOMAN("woman", "kobieta");

    private final String nameEN;
    private final String namePL;

    Gender(String nameEN, String namePL) {
        this.nameEN = nameEN;
        this.namePL = namePL;
    }
    public String getNameEN() {
        return nameEN;
    }
    public String getNamePL() {
        return namePL;
    }
}
