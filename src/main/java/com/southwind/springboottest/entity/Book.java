package com.southwind.springboottest.entity;

import lombok.Data;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: 何处不扁舟
 * @Date: 2020/3/5 18:24
 */
@Entity   //与数据库绑定
@Data   //自动get set equals hashcode tostring
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
}
