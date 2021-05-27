package models_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import statics.TransactionType;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {

    private int id;
    private LocalDateTime transactionDate;
    private int amount;
    private TransactionType transactionType;
}
