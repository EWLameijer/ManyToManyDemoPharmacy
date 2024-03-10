package net.ericwubbo.manytomanyjpa;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 13 min and 53 sec for create, run and check
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;
    @GetMapping
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
