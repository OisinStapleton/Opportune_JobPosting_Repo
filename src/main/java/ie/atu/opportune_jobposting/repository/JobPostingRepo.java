package ie.atu.opportune_jobposting.repository;

import ie.atu.opportune_jobposting.model.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobPostingRepo extends JpaRepository<JobPosting,Integer> {

    List<JobPosting> findByTitle(String title);

    List<JobPosting> findByLocation(String location);

    List<JobPosting> findByEmployerId(Integer employerId);
}
