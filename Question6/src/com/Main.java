package com;

import java.util.ArrayList;
import java.util.Scanner;

class Book {

	private int isbnno;
	private String bookName;
	private String author;
	
	public int getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	void viewAllBooks() 
	{
		
		
		System.out.println(""+isbnno);
		System.out.println(""+bookName);
		System.out.println(""+author);
		
	}
	
	
	
	
}
class Library  extends Book{
	ArrayList bookList = new  ArrayList();
	Book b=new Book();
	
	void addBook() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book number: ");
		int id=sc.nextInt();
		System.out.println("enter the book name: ");
		String name=sc.next();
		System.out.println("enter the book author: ");
		String authors=sc.next();
		
		b.setIsbnno(id);
		b.setBookName(name);
		b.setAuthor(authors);
		
		
	}
	
	boolean isEmpty() 
	{
		if(bookList.isEmpty())
		{
		return true;
		}
		else 
		{
		return false;
		}	
	}
	
	ArrayList viewBooksByAuthor(String author ) 
	{
		return bookList;
		
	}
	int countnoofbook(String bname) 
	{
		
		return 4;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int ch=0;
		do
		{
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("1 ADD BOOK");
			System.out.println("2 DISPLAY BOOK");
			System.out.println("3 SEARCH BOOK BY AUTHORS");
			System.out.println("4 COUNT NO OF BOOKS");
			System.out.println("5 EXIT");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Enter Choice :");
		     ch=sc.nextInt();
		     
		     if(ch==1)
		     {
		    	 Library l=new Library();
		    	l.addBook();
		     }
		     else if (ch==2)
		     {
		    	 Library l=new Library();
		     }
		     else if (ch==3)
		     {
		    	
		     }
		     else if(ch==4)
		     {
		    	
		     }
		    
			
		}
		while(ch!=5);		
		

	}

}
