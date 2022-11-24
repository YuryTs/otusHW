package HW6BankClient;

class Client {
    private String name;
    private int age;

    Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;

        Client otherPerson = (Client) other;
        return this.name.equals(otherPerson.name);
    }

    public String toString() {
        return name + " " + age + " лет. ";
    }
}

