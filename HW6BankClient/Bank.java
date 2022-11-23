package HW6BankClient;

import java.util.*;

class Bank {
    public static void main(String[] args) {

//        Map<Client, Account> clientAccounts = getClientAccount();


        Client client1 = new Client("Иванов", 48);
        Client client2 = new Client("Антонов", 18);
        Client client3 = new Client("Петров", 82);

        Account account1 = new Account(10, 3452.4);
        Account account2 = new Account(20, -345.5);
        Account account3 = new Account(30, 134623.0);
        Account account4 = new Account(40, 56000);


        List<Account> accountList1 = new ArrayList<>();
        accountList1.add(account1);

        List<Account> accountList2 = new ArrayList<>();
        accountList2.add(account2);

        List<Account> accountList3 = new ArrayList<>();
        accountList3.add(account3);
        accountList3.add(account4);



        HashMap<Client, List<Account>> hm = new HashMap<>();

        hm.put(client1, accountList1);
        hm.put(client2, accountList2);
        hm.put(client3, accountList3);

        Set<Map. Entry<Client, List<Account>>> set   = hm. entrySet ( ) ;
        System.out.println(set);

    }
//    private static List<Account> getAccount(Client client){
//        ArrayList<Account> arrayList= new ArrayList<>();
//        arrayList.add
//    }


//
//    }
//    private static Map<Client, Account> getClientAccount(){
//        Client client1 = new Client("Иванов", 48);
//        Client client2 = new Client("Антонов", 18);
//        Client client3 = new Client("Петров", 82);
//
//        Map<Client, Account> clientAccounts = new HashMap<>();
//        clientAccounts.put(client1, new Account(944, client));
//        clientAccounts.put(client2, new Account(522));
//        clientAccounts.put(client3, new Account(3443));
//
//        return clientAccounts;
//    }

}
