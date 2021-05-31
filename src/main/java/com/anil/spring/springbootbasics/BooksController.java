package com.anil.spring.springbootbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Books> getAllBooks(){
        return Arrays.asList(
                new Books(1, "My Book - 1 ", "Anil"),
                new Books(2, "My Book -2 ", "Anil Verma")
        );
    }
}
