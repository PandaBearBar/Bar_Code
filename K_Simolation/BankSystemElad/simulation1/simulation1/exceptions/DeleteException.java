package K_Simolation.BankSystemElad.simulation1.simulation1.exceptions;

/*
Created by Elad on 16/03/2022

*/

import java.util.Date;

public class DeleteException extends Exception {
    private Date timeStamp;

    public DeleteException(String message, Date timeStamp, int clientId, String clientName, double balance) {
        super(message);
        this.timeStamp = timeStamp;
    }
}
