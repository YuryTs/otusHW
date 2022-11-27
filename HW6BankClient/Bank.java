package HW6BankClient;

import java.util.*;

class Bank {
    static Client ivanov = new Client("Иванов", 25);
    static Client antonov = new Client("Антонов", 68);
    static Client petrov = new Client("Петров", 18);

    static Account account1 = new Account(10);
    static Account account2 = new Account(20);
    static Account account3 = new Account(30);
    static Account account4 = new Account(40);


    public static void main(String[] args) {


        Map<Client, List<Account>> clientAcounts = getClientAccounts();
        Map<Account, Client> accountClient = getAccountClient();


        Client ivanov = new Client("Иванов", 25);
        List<Account> ivanovAccounts = clientAcounts.get(ivanov);
        System.out.println("Клиент: " + ivanov + "Счета: " + ivanovAccounts);

        Client antonov = new Client("Антонов", 68);
        List<Account> antonovAccounts = clientAcounts.get(antonov);
        System.out.println("Клиент: " + antonov + "Счета: " + antonovAccounts);

        Client petrov = new Client("Петров", 18);
        List<Account> petrovAccounts = clientAcounts.get(petrov);
        System.out.println("Клиент: " + petrov + "Счета: " + petrovAccounts);

        Account account1 = new Account(10);
        Client accountIvanov = accountClient.get(account1);
        System.out.println("Счет: " + account1 + " принадлежит клиенту: " + accountIvanov);

        Account account2 = new Account(20);
        Client accountAntonov = accountClient.get(account2);
        System.out.println("Счет: " + account2 + " принадлежит клиенту: " + accountAntonov);

        Account account3 = new Account(30);
        Client accountPetrov = accountClient.get(account3);
        System.out.println("Счет: " + account3 + " принадлежит клиенту: " + accountPetrov);

        Account account4 = new Account(40);
        Client accountPetrov2 = accountClient.get(account4);
        System.out.println("Счет: " + account4 + " принадлежит клиенту: " + accountPetrov2);
    }

    private static Map<Client, List<Account>> getClientAccounts() {

        List<Account> accountsList1 = new ArrayList<>();
        accountsList1.add(account1);
        List<Account> accountsList2 = new ArrayList<>();
        accountsList2.add(account2);
        List<Account> accountsList3 = new ArrayList<>();
        accountsList3.add(account3);
        accountsList3.add(account4);


        Map<Client, List<Account>> clientAccounts = new HashMap<>();
        clientAccounts.put(ivanov, accountsList1);
        clientAccounts.put(antonov, accountsList2);
        clientAccounts.put(petrov, accountsList3);
        return clientAccounts;
    }

    private static Map<Account, Client> getAccountClient() {

        Map<Account, Client> accountClient = new HashMap<>();
        accountClient.put(account1, ivanov);
        accountClient.put(account2, antonov);
        accountClient.put(account3, petrov);
        accountClient.put(account4, petrov);
        return accountClient;
    }

}
