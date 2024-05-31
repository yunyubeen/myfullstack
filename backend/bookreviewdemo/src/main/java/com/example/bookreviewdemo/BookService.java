package com.example.bookreviewdemo;

import java.util.List;

public interface BookService {
    List<BookDTO> list();
    BookDTO findById(Long id);
    BookDTO addBook(BookDTO bookDTO);
    void deleteBook(Long id);
    List<BookDTO> searchBooks(String keyword);
    boolean checkDuplicate(String title);
}