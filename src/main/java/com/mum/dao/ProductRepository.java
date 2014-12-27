/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mum.dao;

import com.mum.utils.SessionUtil;
import com.mum.domain.Product;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunil
 */
@Repository
public class ProductRepository extends SessionUtil implements ProductRepositoryLocal {

    private List<Product> listOfProducts = new ArrayList<Product>();

    public ProductRepository() {
       
    }

    @Override
    public List<Product> getAllProducts() {
        return listOfProducts;
    }

    @Override
    public Product getProductById(String productID) {
    //public Product getProductById(String productID,long quantity) {
        Criteria cr=getSession().createCriteria(Product.class);
        cr.add(Restrictions.eq("productId", productID));
        Product product=(Product) cr.uniqueResult();
//        if(product.getUnitsInStock()< quantity){
//            throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ product.getUnitsInStock());
//        }
//        product.setUnitsInStock(product.getUnitsInStock() - quantity);      
        return product;
//        for(Product p:listOfProducts){
//            if(p.getProductId().equals(productID)){
//                return p;
//            }
//        }
//        return null;
    }

    @Override
    public List<Product> getAllProductsDetails() {
        return getSession().createCriteria(Product.class).list();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        Criteria cr=getSession().createCriteria(Product.class);
       // List<Product> products= (List<Product>) cr.uniqueResult();
         cr.add(Restrictions.eq("category", category)); 
         List<Product> products= (List<Product>) cr.list();
        return products;
    }

}
