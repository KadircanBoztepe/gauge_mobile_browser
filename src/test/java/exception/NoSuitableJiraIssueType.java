package exception;

public class NoSuitableJiraIssueType extends Exception {
    private String message;

    public NoSuitableJiraIssueType(String message) {
        this.message = "There is no suitable issue type for this id: " + message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
