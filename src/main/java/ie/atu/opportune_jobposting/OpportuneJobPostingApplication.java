package ie.atu.opportune_jobposting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpportuneJobPostingApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpportuneJobPostingApplication.class, args);
    }

}
