package models_2.AccountOperations;

import models_2.Accounts.Account;
import models_2.Transaction;
import statics.TransactionMessages;
import statics.TransactionType;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class WithdrawSaving implements AccountOperations {

    private boolean permissionToken = false;

    public void setupAccountPermission() {
        this.permissionToken = true;
    }

    @Override
    public TransactionMessages transaction(int withdrawAmount, Account account) throws Exception {
        if (account.getBalance() > withdrawAmount && permissionToken) {
            account.setBalance(account.getBalance() - withdrawAmount);
            Transaction transaction = new Transaction(
                    new AtomicInteger().incrementAndGet(),
                    LocalDateTime.now(),
                    withdrawAmount,
                    TransactionType.WITHDRAW
            );
            account.getTransactionsHistory().addTransaction(transaction);
            return TransactionMessages.WITHDRAW_SUCCESSFUL;
        }
        throw new Exception("" + TransactionMessages.BALANCE_INSUFFICIENT);
    }
}
