
package com.ram.hibernate.controller;

import com.ram.hibernate.service.BookService;

public class BookController {

    public static void main(String[] args) {

        BookService service = new BookService();

        // CREATE
        service.addBook(110, "Java", 2000);

        // READ
//        service.getBook(107);

        // UPDATE
//        service.updateBookPrice(105, 650);

        // READ AGAIN
//        service.getBook(103);
//        service.deleteBook(105);

        // DELETE
        service.deleteBook(105);
    }
}
