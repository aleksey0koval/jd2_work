package it.academy.dao;

import it.academy.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;

    @Autowired
    public ProductDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Product> findAllProducts() {
        return sessionFactory
                .openSession()
                .createQuery("from Product", Product.class)
                .list();
    }

    @Override
    public Product read(String id) {
        return sessionFactory.openSession().get(Product.class, id);
    }

    @Override
    public String save(Product product) {
        Session session = sessionFactory.getCurrentSession();
        String id = (String) session.save(product);

        return id;
    }
}
