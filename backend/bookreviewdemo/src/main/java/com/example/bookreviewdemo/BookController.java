package com.example.bookreviewdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<BookDTO> list() {
        return bookService.list();
    }

    @GetMapping("/books/{id}")
    public BookDTO book(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping("/books")
    public BookDTO addBook(@RequestBody BookDTO bookDTO) {
        return bookService.addBook(bookDTO);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/books/search")
    public List<BookDTO> searchBooks(@RequestParam String keyword) {
        return bookService.searchBooks(keyword);
    }

    @GetMapping("/books/check-duplicate")
    public boolean checkDuplicate(@RequestParam String title) {
        return bookService.checkDuplicate(title);
    }
}