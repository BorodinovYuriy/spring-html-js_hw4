package ru.gb.buv.springhtmljs.controllers;


import org.springframework.web.bind.annotation.*;
import ru.gb.buv.springhtmljs.data.Product;
import ru.gb.buv.springhtmljs.services.ProductService;
import java.util.List;

@RestController
public class MainController {
    private ProductService productService;
    public MainController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getListAllProducts(){
        return productService.getAllProducts();
    }
    //при get - void и @RestController -> возвращает "200" ОК! и так тоже(но не видно...)
    @PostMapping("/products/delete/{id}")
    public void deleteProductById(@PathVariable int id){
        productService.deleteProductById(id);
    }
    @PostMapping("/products/add")
    public void addNewProduct(@RequestBody Product p){
        productService.addNewProduct(p.getTitle(),p.getCost());
    }
}
