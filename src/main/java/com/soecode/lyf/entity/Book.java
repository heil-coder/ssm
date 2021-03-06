package com.soecode.lyf.entity;

import javax.persistence.*;
/**
 * 图书实体
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "book_id")
	private long bookId;// 图书ID

    @Column(name = "name")
	private String name;// 图书名称

    @Column(name = "number")
	private int number;// 馆藏数量

	public Book() {
	}

	public Book(long bookId, String name, int number) {
		this.bookId = bookId;
		this.name = name;
		this.number = number;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", number=" + number + "]";
	}


}
