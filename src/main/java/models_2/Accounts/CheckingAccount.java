package models_2.Accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import models_2.AccountOperations.AccountOperations;
import models_2.AccountOperations.DepositOp;
import models_2.AccountOperations.WithdrawOp;

@Getter
@Setter
@AllArgsConstructor
class CheckingAccount extends Account {

    private AccountOperations deposit;
    private AccountOperations withdraw;

    public CheckingAccount() {
        this.deposit = new DepositOp();
        this.withdraw = new WithdrawOp();
    }
}
