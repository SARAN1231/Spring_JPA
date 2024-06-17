package com.saran.jpa.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data // -> contains all above annotations in one
@AllArgsConstructor
@NoArgsConstructor // -> Annotation by lambok to create a noargconstructor bcoz entity should contain noargsconstructor
@Entity
public class Course extends BaseEntity {

    private String name;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "Author_courses",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    @OneToMany(
            mappedBy = "course"
    )
    private List<Section> sections;
}
