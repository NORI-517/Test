package com.main.repository;

import com.main.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
}
