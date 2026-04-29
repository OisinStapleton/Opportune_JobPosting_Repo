package ie.atu.opportune_jobposting.exception;

public class JobPostingNotFoundException extends RuntimeException {
    public JobPostingNotFoundException(String jobpostingNotFound) {
        super(jobpostingNotFound);
    }
}
