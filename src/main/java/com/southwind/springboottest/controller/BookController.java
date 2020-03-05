package com.southwind.springboottest.controller;

import com.southwind.springboottest.entity.Book;
import com.southwind.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 何处不扁舟
 * @Date: 2020/3/5 20:42
 */
@RequestMapping("/book")
@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page")Integer page,@PathVariable Integer size){
        PageRequest request= PageRequest.of(page, size);
        return bookRepository.findAll(request);
    }

    @PostMapping("/save")
//    @RequestBody将json转为java对象
    public String save(@RequestBody Book book){
        Book res = bookRepository.save(book);
        if(res!=null)
            return "success";
        else return "error";
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id")Integer id){
        return bookRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody Book book){
        Book res = bookRepository.save(book);
        if(res!=null)
            return "success";
        else return "error";
    }
}
