package models_1;

public interface AccountOperations {

    TransactionResponse deposit(int amount);

    TransactionResponse withdraw(int amount) throws Exception;

}
