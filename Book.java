package Assignment;

import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String author;
    private String language;
    private double price;
    private String publishDate;
    private long ISBN;
    
    public Book() {
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID of the book: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name of the book: ");
        this.name = sc.nextLine();
        System.out.print("Enter author of the book: ");
        this.author = sc.nextLine();
        System.out.print("Enter language of the book: ");
        this.language = sc.nextLine();
        System.out.print("Enter price of the book: ");
        this.price = sc.nextDouble();
        System.out.println("Enter publish date of the book: ");
        this.publishDate=sc.nextLine();
        System.out.print("Enter ISBN of the book: ");
        this.ISBN = sc.nextLong();
    }
    
    public void output()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Language: " + this.language);
        System.out.println("Price: " + this.price);
        System.out.println("Publish date: " + this.publishDate);
        System.out.println("ISBN: " + this.ISBN);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    
   
    
    
}


