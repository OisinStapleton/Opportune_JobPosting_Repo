package ie.atu.opportune_jobposting.client;

import ie.atu.opportune_jobposting.model.JobPosting;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="jobPost-service", url="http://localhost:8085")
public interface JP_Client {
    @GetMapping("/jobPosting")
    JobPosting getJobPosting(@PathVariable String id);
}
