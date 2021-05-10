package exception;

public class NoSuitableStatus extends Exception {
    public String message;

    public NoSuitableStatus(String issueKey) {
        this.message = "There is no suitable status for this issue in jira \n" +
                "please check your permissions and issue type and current status.\n" +
                "Jira issue key: " + issueKey;
    }


    @Override
    public String getMessage() {
        return message;
    }
}
