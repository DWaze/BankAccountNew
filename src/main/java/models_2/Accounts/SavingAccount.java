package models_2.Accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import models_2.AccountOperations.AccountOperations;
import models_2.AccountOperations.DepositOp;
import models_2.AccountOperations.WithdrawSaving;

@Getter
@Setter
@AllArgsConstructor
public class SavingAccount extends Account {

    private AccountOperations deposit;
    private AccountOperations withdrawSaving;

    public SavingAccount() {
        this.deposit = new DepositOp();
        this.withdrawSaving = new WithdrawSaving();
    }

    public void makeSpecialSaving(int amount) throws Exception {
        ((WithdrawSaving) this.withdrawSaving).setupAccountPermission();
        this.withdrawSaving.transaction(amount, this);
    }

}
