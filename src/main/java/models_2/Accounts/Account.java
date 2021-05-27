package models_2.Accounts;

import lombok.Data;
import lombok.EqualsAndHashCode;
import models_2.TransactionsHistory;
import models_2.User;

@EqualsAndHashCode(callSuper = true)
@Data
public class Account extends User {

    private int balance;
    private TransactionsHistory transactionsHistory;

}
