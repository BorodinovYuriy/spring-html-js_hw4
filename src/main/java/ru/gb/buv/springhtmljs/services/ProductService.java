package ru.gb.buv.springhtmljs.services;

import org.springframework.stereotype.Service;
import ru.gb.buv.springhtmljs.data.Product;
import ru.gb.buv.springhtmljs.repositories.ProductRepository;

import java.util.List;

/*контроллеры работают с сервисами, сарвисы с репозиторием(один сервис-один репозиторий)*/
@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts(){
        return productRepository.getListAllProduct();
    }
    public void deleteProductById(int id){
        productRepository.deleteById(id);
    }
    public void addNewProduct(String title, int cost){
        Product product = new Product();
        product.setTitle(title);
        product.setCost(cost);
        productRepository.addProduct(product);
    }


}
