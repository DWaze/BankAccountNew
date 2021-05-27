package models_1;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import statics.TransactionDisplayType;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class TransactionsHistory implements TransactionHistory {

    private final List<Transaction> transactionsHistories;

    TransactionsHistory() {
        this.transactionsHistories = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactionsHistories.add(transaction);
    }

    @Override
    public void removeTransaction(int transactionId) {
        transactionsHistories
                .stream()
                .filter(
                        transaction -> transactionId == transaction.getId())
                .findAny().ifPresent(
                transactionsHistories::remove
        );
    }

    public String showTransactions(TransactionDisplayType transactionType) {
        String transHistoryStr = "";
        switch (transactionType) {
            case JSON_FORMAT:
                transHistoryStr = new Gson().toJson(this.transactionsHistories);
                break;
            case SIMPLE_FORMAT:
                StringBuilder transHistory = new StringBuilder("Total models.Balance: " +
                        "\n" + "Date | Amount | models.Transaction \n");
                transactionsHistories.forEach(
                        transaction -> {
                            transHistory.append("").
                                    append(transaction.getTransactionDate()).
                                    append(" | ").append(transaction.getAmount()).
                                    append(" | ").append(transaction.getTransactionType()).append("\n");
                        }
                );
                transHistoryStr = transHistory.toString();
                break;
        }
        return transHistoryStr;
    }


}
