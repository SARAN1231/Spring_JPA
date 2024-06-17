package com.saran.jpa.Services;

import com.saran.jpa.Models.Author;
import com.saran.jpa.Repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;


    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public String hello() {
        return "Hello World";
    }
    public Author save(Author author) {
        return authorRepository.save(author);
    }
    public  String deletestudent(int id) {
        authorRepository.deleteById(id);
        return "Deleted Successfully";
    }

}
