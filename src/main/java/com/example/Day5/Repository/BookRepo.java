package com.example.Day5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day5.Model.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {

}