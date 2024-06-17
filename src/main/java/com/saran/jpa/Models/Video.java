package com.saran.jpa.Models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
// tables per class -> @Polymorphism(type = PolymorphismType.EXPLICIT) // when query the resource class subclass need not be displayed refer vdo -> 11:07
//@PrimaryKeyJoinColumn(name = "video_id") // column name for foreign key referencing parent class id
//@DiscriminatorValue("V")
public class Video extends Resources{
    private Integer Length;
}
