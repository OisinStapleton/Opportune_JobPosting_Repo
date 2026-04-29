package ie.atu.opportune_jobposting.controller;

import ie.atu.opportune_jobposting.model.JobPosting;
import ie.atu.opportune_jobposting.service.JP_Service;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobposting")
public class JP_Controller {
    private final JP_Service JPservice;
    public JP_Controller(JP_Service JPservice)
    {
        this.JPservice= JPservice;
    }

    @PostMapping
    public ResponseEntity<JobPosting> createJobPosting(@Valid @RequestBody JobPosting jobPosting)
    {
        JobPosting saved = JPservice.addJobPost(jobPosting);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPosting> getJobPostingId(@PathVariable int id){
        return ResponseEntity.ok(JPservice.getJobPostingId(id));
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<JobPosting>> getJobPostingByTitle(@PathVariable String title){
        return ResponseEntity.ok(JPservice.getJobPostingByTitle(Integer.valueOf(title))); // had to be wrapped so string can be used instead of int
    }
}
