package ie.atu.opportune_jobposting.controller;

import ie.atu.opportune_jobposting.model.JobPosting;
import ie.atu.opportune_jobposting.service.JobPostingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobpostings")
public class JobPostingController {

    private final JobPostingService jobPostingService;

    public JobPostingController(JobPostingService jobPostingservice)
    {
        this.jobPostingService= jobPostingservice;
    }

    @PostMapping
    public ResponseEntity<JobPosting> create(@Valid @RequestBody JobPosting jobPosting)
    {
        JobPosting saved = jobPostingService.create(jobPosting);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPosting> getById(@PathVariable int id){
        return ResponseEntity.ok(jobPostingService.getById(id));
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<JobPosting>> getByTitle(@PathVariable String title) {
        return ResponseEntity.ok(jobPostingService.getByTitle(title));
    }

    @GetMapping
    public ResponseEntity<List<JobPosting>> getAll(){
        return ResponseEntity.ok(jobPostingService.getAll());
        }
    }
