package com.itzyzx.springclouddemo1.demo.demo1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @CLassName Demo1test
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/6 10:01
 * @Version 1.0
 */
public class Demo1test {

@Autowired
private Book book;

	public static void main(String[] args) {
		//Book book=new Book();
		//System.out.println("bookName:"+book.getBook()+"----author:"+book.getAuthor());
	}
}
