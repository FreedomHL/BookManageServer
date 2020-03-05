package com.southwind.springboottest;

import com.southwind.springboottest.entity.Book;
import com.southwind.springboottest.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.xml.ws.soap.Addressing;

@SpringBootTest
class SpringboottestApplicationTests {
    @Autowired
    private BookRepository bookRepository;
    @Test
    void contextLoads() {
        PageRequest pageRequest=PageRequest.of(0, 3);
        Page<Book> page= bookRepository.findAll(pageRequest);
        int i=0;
    }

    @Test
    void save(){
        Book book=new Book();
        book.setName("SpringBott");
        book.setAuthor("张三");
        Book book1 = bookRepository.save(book);
        System.out.println(book1);
    }

    @Test
    void findById(){
        Book book = bookRepository.findById(1).get();
        System.out.println(book);
    }

    @Test
    void update(){
        Book book=new Book();
        book.setId(128);
        book.setName("秀嘎");
        book.setAuthor("grd");
        bookRepository.save(book);
    }

    @Test
    void delete(){
        bookRepository.deleteById(125);
    }
}
