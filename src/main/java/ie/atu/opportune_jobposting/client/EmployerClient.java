package ie.atu.opportune_jobposting.client;

import ie.atu.opportune_jobposting.dto.EmployerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="employer-service", url="http://localhost:8085")

public interface EmployerClient {
    @GetMapping("/employers/{id}")
    EmployerDTO getEmployer(@PathVariable Integer id);
}
