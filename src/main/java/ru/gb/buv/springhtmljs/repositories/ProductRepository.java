package ru.gb.buv.springhtmljs.repositories;

import org.springframework.stereotype.Component;
import ru.gb.buv.springhtmljs.data.Product;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> someProducts;
    private static int IDCOUNT = 0;
    @PostConstruct
    public void addSomeProducts(){
        someProducts = new ArrayList<>();
        someProducts.add(new Product(++IDCOUNT,"Лапка суриката",10));
        someProducts.add(new Product(++IDCOUNT,"Глазик воробья",100));
        someProducts.add(new Product(++IDCOUNT,"Рог единорога",100));
        someProducts.add(new Product(++IDCOUNT,"Хвостик кабана",100));
        someProducts.add(new Product(++IDCOUNT,"Печень кашалота",1000));
        someProducts.add(new Product(++IDCOUNT,"Кровь врагов",50));
        someProducts.add(new Product(++IDCOUNT,"Кизяк",300));
        someProducts.add(new Product(++IDCOUNT,"Высохшие соты",50));
        someProducts.add(new Product(++IDCOUNT,"Вой ночных собак",2000));
    }
    public List<Product> getListAllProduct() {
        return someProducts;
    }
    public void addProduct(Product product){
        product.setId(++IDCOUNT);
        someProducts.add(product);
    }
    public void deleteById(int id){
        for (int i = 0; i < someProducts.size(); i++) {
            if (someProducts.get(i).getId() == id) {
                someProducts.remove(i);
            }
        }
    }












}