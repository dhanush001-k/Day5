package com.example.Day5.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Day5.Model.Book;
import com.example.Day5.Repository.BookRepo;

@Service
public class BookServe {
	@Autowired
    BookRepo btRepo;
	public Book saveDetails(Book e)
	{
		return btRepo.save(e);
	}
	public List<Book> getDetails()
	{
		return btRepo.findAll();
	}
	public Book updateDetails(Book e1)
	{
		return btRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int id)
	{
		btRepo.deleteById(id);
	}

}
