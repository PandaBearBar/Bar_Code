package K_Simolation.API_S1.Exceptions;

import java.util.Date;

public class deleteException extends Exception {
    private Date timeStamp;

    public deleteException(String meesege, int clientId, Date timeStamp, String Name, double balance) {
        super(
                "Cause :" + meesege + "" +
                "\n@ : " + timeStamp + "" +
                "\nClient ID : " + clientId +
                "\nName : " + Name + "" +
                "\nBalnce of :" + balance
        );

    }

}
