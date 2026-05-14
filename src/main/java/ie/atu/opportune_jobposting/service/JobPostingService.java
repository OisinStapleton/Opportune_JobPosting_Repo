package ie.atu.opportune_jobposting.service;

import ie.atu.opportune_jobposting.client.EmployerClient;
import ie.atu.opportune_jobposting.exception.JobPostingNotFoundException;
import ie.atu.opportune_jobposting.model.JobPosting;
import ie.atu.opportune_jobposting.repository.JobPostingRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingService {

    private final JobPostingRepo repository;
    private final EmployerClient employerClient;

    public JobPostingService(JobPostingRepo repository, EmployerClient employerClient) {
        this.repository = repository;
        this.employerClient = employerClient;
    }

    //Create
    public JobPosting create(JobPosting jobPosting) {

        employerClient.getEmployer(jobPosting.getEmployerId());
        return repository.save(jobPosting);
        }

        // Get by ID
        public JobPosting getById(Integer id) {
            return  repository.findById(id).orElseThrow(() -> new JobPostingNotFoundException("Job Post not found"));
        }

        //Get by Title
        public List<JobPosting> getByTitle(String jobPostingTitle) {
        return repository.findByTitle(jobPostingTitle);
        }

        //Get All
        public List<JobPosting> getAll() {
        return repository.findAll();
    }

}
