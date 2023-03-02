package com.example.Day5.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day5.Model.Book;
import com.example.Day5.Service.BookServe;



@RestController
public class ApiController {
	@Autowired
	BookServe buService;
	@PostMapping("/addDetails")
	public Book addInfo(@RequestBody Book st)
	{
		return buService.saveDetails(st);
	}
	@GetMapping("/getDetails")
	public List<Book> fetchDetails()
	{
		return buService.getDetails();
	}
	@PutMapping("/updateDetails")
	public Book updateinfo(@RequestBody Book st)
	{
		return buService.saveDetails(st);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id") int id)
	{
		buService.deleteDetails(id);
		return "Deleted details";
	}

}

