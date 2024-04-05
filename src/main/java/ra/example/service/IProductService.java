package ra.example.service;

import org.springframework.web.multipart.MultipartFile;
import ra.example.exception.NotFoundEntityException;
import ra.example.model.dto.ProductRequest;
import ra.example.model.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    Product addProduct(ProductRequest productRequest);
    Product updateProduct(Product product, MultipartFile imageUpdate) throws NotFoundEntityException;
    void deleteById(Long id);
    Product findById(Long id) throws NotFoundEntityException;
}
