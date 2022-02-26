/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi12_Exeption.Bai10;

/**
 *
 * @author NAM SYSTEM
 */
public class Book {
    private int iD;
    private String authors;
    private String title;
    private String category;

    public Book(int iD, String authors, String title, String category) {
        this.iD = iD;
        this.authors = authors;
        this.title = title;
        this.category = category;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  iD +"$" + authors+ "$"+title +"$";
    }
    
    
}
