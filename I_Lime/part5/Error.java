package I_Lime.part5;

public enum Error {
    NULL_OR_EMPTY("the list is null or empty"),
    EMPLOYEE_NOT_FOUND("the given employee not found"),
    EPLOYEE_ALREADY_EXIST("the given employee is already exist"),
    FILE_WRITE_PROBLEM("writing to the file went wrong");

    private final String message;

    private Error(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
