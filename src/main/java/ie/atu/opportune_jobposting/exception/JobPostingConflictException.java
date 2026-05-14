package ie.atu.opportune_jobposting.exception;

public class JobPostingConflictException extends RuntimeException {
    public JobPostingConflictException(String duplicate) {
        super(duplicate);
    }
}
