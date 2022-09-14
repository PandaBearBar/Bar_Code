package K_Simolation.API_S1_V2.Exceptions;

import java.time.LocalDate;
import java.util.Date;

public class withdrawException extends Exception {
    private Date timestamp;
    public withdrawException(String message, Date timestamp, int clientId, String clientName, double balance) {
        super(
                "Cause :" + message + "" +
                        "\n@ : " + timestamp + "" +
                        "\nClient ID : " + clientId +
                        "\nName : " + clientName + "" +
                        "\nBalnce of :" + balance
        );
        this.timestamp = timestamp;
    }
}
