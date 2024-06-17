package com.saran.jpa.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//@Getter -> Annotation by lambok to create a getter for all fields in this class
//@Setter  -> Annotation by lambok to create a setter for all fields in this class
  //->  Annotation by lambok to create a AllArgsConstructor
@Data // -> contains all above annotations in one
@AllArgsConstructor
@NoArgsConstructor // -> Annotation by lambok to create a noargconstructor bcoz entity should contain noargsconstructor
@Entity
@EqualsAndHashCode(callSuper=true) // when extends is used then this annotation must be used
public class Author extends BaseEntity{

    private String firstname;
    private String lastname;
    @Column(unique = true,
    nullable = false)
    private String email;
    private Integer age;

    @ManyToMany(
            mappedBy = "authors"
    )
    private List<Course> courses;
}
