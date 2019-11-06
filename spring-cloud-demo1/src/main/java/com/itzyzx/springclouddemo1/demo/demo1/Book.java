package com.itzyzx.springclouddemo1.demo.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @CLassName Book
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/6 9:57
 * @Version 1.0
 */
@Component
public class Book {
	//@Value("#{book.name}")
	private String book;
	//@Value("#{book.author}")
	private String author;
	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book{" +
				"book='" + book + '\'' +
				", author='" + author + '\'' +
				'}';
	}
}
