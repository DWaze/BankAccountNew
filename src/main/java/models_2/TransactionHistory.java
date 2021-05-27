package models_2;

import statics.TransactionDisplayType;

public interface TransactionHistory {
    void addTransaction(Transaction transaction);
    void removeTransaction(int transactionId);
    String showTransactions(TransactionDisplayType transactionDisplayType);
}
