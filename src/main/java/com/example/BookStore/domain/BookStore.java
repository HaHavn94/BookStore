package com.example.BookStore.domain;

public class BookStore{

private String title;
private String author;
private int  publicationYear;
private String isbn;
private Double price;

public BookStore(String title, String author, int publicationYear, String isbn, Double price) {
	super();
	this.title = title;
	this.author = author;
	this.publicationYear = publicationYear;
	this.isbn = isbn;
	this.price = price;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getPublicationYear() {
	return publicationYear;
}

public void setPublicationYear(int publicationYear) {
	this.publicationYear = publicationYear;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}



}

