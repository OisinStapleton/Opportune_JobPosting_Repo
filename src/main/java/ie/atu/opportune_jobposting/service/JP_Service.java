package ie.atu.opportune_jobposting.service;

import ie.atu.opportune_jobposting.exception.JobPostingNotFoundException;
import ie.atu.opportune_jobposting.model.JobPosting;
import ie.atu.opportune_jobposting.repository.JP_Repo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JP_Service {

    private List<JobPosting> jobPostings;
    private final JP_Repo jobPostingRepository;

    public JP_Service(JP_Repo jobPostingRepository) {
        this.jobPostingRepository = jobPostingRepository;
    }

    //Create
    public JobPosting addJobPost(JobPosting jobPosting)
        {
        jobPostingRepository.save(jobPosting);
        return jobPostingRepository.save(jobPosting);
        }

        public JobPosting getJobPostingId(Integer jobPostingId)
        {
            return  jobPostingRepository.findById(jobPostingId).orElseThrow(() -> new JobPostingNotFoundException("Job Post not found"));
        }

        //Get by Title
        public List<JobPosting> getJobPostingByTitle(Integer jobPostingTitle) {
        return jobPostingRepository.findByJobPostingTitle(jobPostingTitle);
        }
}
