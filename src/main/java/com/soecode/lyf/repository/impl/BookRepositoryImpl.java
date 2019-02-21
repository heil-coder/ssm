package com.soecode.lyf.repository.impl;

import com.soecode.lyf.entity.Book;
import com.soecode.lyf.repository.BookRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by XRom
 * On 11/16/2017.11:55 PM
 */
@Repository
public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    @Override
    public Book load(Long id) {
        return (Book) getCurrentSession().load(Book.class, id);
    }

    @Override
    public Book get(Long id) {
        System.out.println(id);
        return (Book) getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> findAll() {
        Query query = getCurrentSession().createQuery("FROM Book");
        List<Book> books = query.list();
        return books;
    }

    @Override
    public void persist(Book entity) {
        getCurrentSession().persist(entity);
    }

    @Override
    public Long save(Book entity) {
        return (Long) getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(Book entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(Long id) {
        Book book= load(id);
        getCurrentSession().delete(book);
    }

    @Override
    public void flush() {
        getCurrentSession().flush();
    }
}
