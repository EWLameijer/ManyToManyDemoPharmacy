package net.ericwubbo.manytomanyjpa;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Allergy {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    public Allergy(String description) {
        this.description = description;
    }
}
