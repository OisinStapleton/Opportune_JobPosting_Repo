package ie.atu.opportune_jobposting.repository;

import ie.atu.opportune_jobposting.model.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JP_Repo extends JpaRepository<JobPosting,Integer> {
    List<JobPosting> findByJobPostingTitle(Integer jobPostingTitle);
}
