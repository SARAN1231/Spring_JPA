package com.saran.jpa.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data // -> contains all above annotations in one
@AllArgsConstructor
@NoArgsConstructor // -> Annotation by lambok to create a noargconstructor bcoz entity should contain noargsconstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // most efficient it creates table for each subclass with their fields + parent class fields for more refer vd0 -> 11:00
//@Inheritance(strategy = InheritanceType.JOINED) // efficient for more subclasses it create  table for each subclass with fields specified in it and each have foreign key referencing parent class id
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // all fields from subclass in joined to parents table with discrminatorcolumn
//@DiscriminatorColumn(name = "resource_type") -> for single table inheritance we need to use discriminatorcolumn in parent class and discriminatorvalue in chils class (inefficient if we have more subclass for more refer vdo 10.50)
public class Resources   {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
