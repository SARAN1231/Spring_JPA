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
public class Section extends BaseEntity{

    private String name;
    private Integer SectionOrder;

    @ManyToOne
    @JoinColumn(
            name = "course_id"
    )
    private Course course;

    @OneToMany(
            mappedBy = "section"
    )
    private List<Lecture> lectures;
}
