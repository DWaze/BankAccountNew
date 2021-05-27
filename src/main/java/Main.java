

public class Main {

    public static void main(String[] args) {
//        while (true) {
//            System.out.println("Hello and welcome, would you like to create an account: Y/N");
//            Scanner userInput = new Scanner(System.in);
//            String createAccount = userInput.nextLine();
//            if (createAccount.equals("Y") || createAccount.equals("y")) {
//                Account account = new Account();
//                try {
//                    account.setFirstName("ABBASSEN");
//                    account.setFirstName("REDHA");
//                    account.setFirstName("0785");
//                    System.out.println("------- ACCOUNT CREATED -------");
//                    while (true) {
//                        System.out.println("List of actions: (d) Deposit/ (w) Withdraw/ (p) Print/ (e) Exit");
//                        userInput = new Scanner(System.in);
//                        String response = userInput.nextLine();
//                        if (response.equals("e")) {
//                            System.out.println("Thanks for using the app.");
//                            break;
//                        }
//                        if (response.equals("w")) {
//                            System.out.println("What amount would you like to withdraw? ");
//                            int amount = userInput.nextInt();
//                            if (amount > 0) {
//                                WithdrawOp withdrawOp = new WithdrawOp();
//                                System.out.println(withdrawOp.makeTransaction(amount, account));
//                            } else {
//                                System.out.println("Amount can't be negative");
//                            }
//                        }
//                        if (response.equals("d")) {
//                            System.out.println("What amount would you like to deposit? ");
//                            int amount = userInput.nextInt();
//                            if (amount > 0) {
//                                DepositOp depositOp = new DepositOp();
//                                System.out.println(depositOp.makeTransaction(amount, account));
//                            } else {
//                                System.out.println("Amount can't be negative");
//                            }
//                        }
//                        if (response.equals("p")) {
//                            System.out.println(account.showTransactions());
//                        }
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    account.setBalance(null);
//                    account.setTransactionsHistory(null);
//                }
//            } else {
//                System.out.println("Good buy.");
//                break;
//            }
//        }
    }
}
