package com.xu.service.impl;

import com.xu.dao.BooksMapper;
import com.xu.pojo.Books;
import com.xu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {
    //service调Dao层：组合dao层
    private BooksMapper booksMapper;
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }


    @Override
    public int addBook(Books books) {
        return booksMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}
