public class Customer {
    private int id;
    private String name;
    private String surname;
    private String pin;

    public Customer(int id, String name, String surname, String pin) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
