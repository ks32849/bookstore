package de.freeworkers.examples.bookstore.entity;

import java.io.Serializable;


@Entity
@Table(name = "books")
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
})
public class Book implements Serializable {

}