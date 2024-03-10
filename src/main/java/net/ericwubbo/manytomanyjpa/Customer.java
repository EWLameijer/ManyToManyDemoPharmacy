package net.ericwubbo.manytomanyjpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String firstname;

    @ManyToMany
    private Set<Allergy> allergies = new HashSet<>();

    public Customer(String firstname, Set<Allergy> allergies) {
        this.firstname = firstname;
        this.allergies = allergies;
    }
}
