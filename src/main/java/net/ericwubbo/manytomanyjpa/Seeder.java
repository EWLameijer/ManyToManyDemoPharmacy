package net.ericwubbo.manytomanyjpa;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Component
public class Seeder implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    private final AllergyRepository allergyRepository;

    @Override
    public void run(String... args) throws Exception {
        if (customerRepository.count() == 0) {
            var peanutAllergy = new Allergy("peanuts");
            var catAllergy = new Allergy("cats");
            allergyRepository.saveAll(List.of(peanutAllergy, catAllergy));
            var bob = new Customer("Bob", Set.of(peanutAllergy, catAllergy));
            var lisa = new Customer("Lisa", Set.of(peanutAllergy));
            customerRepository.saveAll(List.of(bob, lisa));
        }
    }
}
