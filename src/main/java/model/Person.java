package model;

// Nie można utworzyć obiektu klasy abstrakcyjnej
public abstract class Person {
    // pola klasowe
    private String name;
    private String lastName;
    // pola statyczne
    private static int staticNo;

    // metody abstrakcyjne
    public abstract void repr();

    // metody
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public static int getStaticNo() {
        return staticNo;
    }

    public static void setStaticNo(int staticNo) {
        Person.staticNo = staticNo;
    }
}
