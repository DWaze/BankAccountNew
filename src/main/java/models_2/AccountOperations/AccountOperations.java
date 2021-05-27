package models_2.AccountOperations;

import models_2.Accounts.Account;
import statics.TransactionMessages;

public interface AccountOperations {

    TransactionMessages transaction(int amount, Account account) throws Exception;

}
