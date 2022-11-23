package HW6BankClient;

class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account id: "+ id + ", balance = " + balance;
//    }
//    public Double toString() {
//        return balance;
//    }

        //    public Account(int generateAccountId, long valueGoldCoin) {
////    }
//    public Account() {
//        this.id = AccountFactory.generateAccountId();
//        this.balance = AccountFactory.generateBalance();
//    }
//
//    public static Account createRandom() {
//        return new Account(AccountFactory.generateAccountId(), AccountFactory.generateBalance());
//    }
//    public int getId() {
//        return id;
//    }
//
//    public double getBalance() {
//        return balance;
//    }


//    public getAccounts(Client client){
//        for
//    }

//    public void setValueGoldCoin(double valueGoldCoin) {
//        this.balance = valueGoldCoin;
//    }

        //    public int getCode(Client ob) {
//        code = new Random().nextInt();;
//        return code;
//    }
    }
}
