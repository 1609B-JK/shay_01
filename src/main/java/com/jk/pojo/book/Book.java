package com.jk.pojo.book;

import java.io.Serializable;

/**
 * Created by apple on 2017/5/17.
 */
public class Book implements Serializable {

    private int bookID;

    private String bookName;

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
