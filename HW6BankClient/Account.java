package HW6BankClient;

public class Account {
    private Integer id;

    public Account(Integer id) {
        this.id = id;
    }

    public int hashCode() {
        return id.hashCode();
    }
    @Override
    public boolean equals(Object other) {
        Account otherAccount = (Account) other;
        return id == otherAccount.id;
    }

    public String toString() {
        return "Account id "+ id;
    }

}
