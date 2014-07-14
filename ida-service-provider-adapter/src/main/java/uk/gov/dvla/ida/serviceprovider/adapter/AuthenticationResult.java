package uk.gov.dvla.ida.serviceprovider.adapter;

public class AuthenticationResult {

    public enum Status {
        SUCCESS, SUCCESS_NO_MATCH, INVALID_MESSAGE, CANCELED, FAILURE, INVALID_CREDENTIALS
    }

    private String pid;

    private Status status;

    private String originalRequestId;

    public AuthenticationResult(String pid, Status status) {
        this(pid, status, null);
    }

    public AuthenticationResult(String pid, Status status, String originalRequestId) {
        this.pid = pid;
        this.status = status;
        this.originalRequestId = originalRequestId;
    }

    public String getPid() {
        return pid;
    }

    public Status getStatus() {
        return status;
    }

    public String getOriginalRequestId() {
        return originalRequestId;
    }
}
