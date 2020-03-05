package com.southwind.springboottest.repository;

import com.southwind.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: 何处不扁舟
 * @Date: 2020/3/5 18:26
 */
public interface BookRepository extends JpaRepository<Book,Integer> {

}
