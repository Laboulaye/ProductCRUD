package com.study.productcrud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public List<Product> findAll(){
        return productRepo.findAll();
    }

    public Optional<Product> findById(Long id){
        return productRepo.findById(id);
    }

    public Product save(Product stock){
        return productRepo.save(stock);
    }

    public void deleteById(Long id){
        productRepo.deleteById(id);
    }

}
