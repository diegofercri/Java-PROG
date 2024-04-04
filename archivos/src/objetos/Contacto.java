package objetos;

public class Contacto {
    private String name;
    private String surname;
    private long phone;

    public Contacto(String name, String surname, long phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }
    public Contacto(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            ", phone='" + getPhone() + "'" +
            "}";
    }
}
