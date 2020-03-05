package com.southwind.springboottest.repository;

import com.southwind.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: 何处不扁舟
 * @Date: 2020/3/5 18:29
 */
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;
    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());
    }
}