package I_Lime.part4;

public enum Error {
    NULL_OR_EMPTY("the list is null or empty"),
    EMPLOYEE_NOT_FOUND("the given employee not found"),
    EPLOYEE_ALREADY_EXIST("the given employee is already exist");

    private final String message;

    private Error(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
