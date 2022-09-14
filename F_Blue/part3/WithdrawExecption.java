package F_Blue.part3;

import java.time.LocalDateTime;

public class WithdrawExecption extends Exception {
    public WithdrawExecption(int clientId, double balance, double amount) {
        super(
                "No Enough money, \n" +
                "Withdraw is not allowed for \n" +
                "client id   : " + clientId +
                " , \nbalance   : " + balance +
                ", \namount    : " + amount +
                ", \non        : " + LocalDateTime.now());
    }
}
