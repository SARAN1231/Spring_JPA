package com.saran.jpa.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data // -> contains all above annotations in one
@AllArgsConstructor
@NoArgsConstructor // -> Annotation by lambok to create a noargconstructor bcoz entity should contain noargsconstructor
@Entity
public class Lecture extends BaseEntity{


    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resources resources;
}
