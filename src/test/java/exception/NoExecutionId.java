package exception;

public class NoExecutionId extends Exception {
    String message;

    public NoExecutionId() {
        this.message = "Please define an ExecutionId on spec tags or scenario tags";
    }

    @Override
    public String getMessage() {
        return message;
    }

}
