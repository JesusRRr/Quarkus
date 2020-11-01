package com.rolon.quarkus;

import com.rolon.quarkus.data.Book;
import io.netty.util.internal.StringUtil;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Path("/book")
public class BookResource {
    private static List<Book> books = new ArrayList<>();

    static{
        books.add(new Book("The Freelancer's bible","IDK"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Book> getBooks() {
        return books;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Book addBook(@Valid  Book book){
        books.add(book);
        return book;
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book updateBook(@PathParam("id") Integer index, Book book){
        books.remove((int) index);
        books.add(index, book);
        return book;

    }
   @DELETE
   @Path("/{id}")
   @Produces(MediaType.APPLICATION_JSON)
    public Book deleteBook(@PathParam("id") Integer index){
        return books.remove((int) index);
    }



}
