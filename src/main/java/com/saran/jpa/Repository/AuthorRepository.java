package com.saran.jpa.Repository;

import com.saran.jpa.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    // select * from Author where first_name = "saran"
    List<Author> findByFirstnameIgnoreCase(String firstName);

    // select * from Author where first_name = "saran"
    List<Author> findByLastnameIgnoreCase0(String lastName);

    // select * from Author where first_name like "sa%"
    List<Author> findByFirstnameStartsWith(String lastName);

}
