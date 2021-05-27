package models_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import statics.TransactionMessages;

@Data
@AllArgsConstructor
public class TransactionResponse {
    int postBalance;
    TransactionMessages transactionMessages;
}
