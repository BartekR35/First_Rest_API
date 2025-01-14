package pl.edu.vistula.first_rest_api.product.support;

import pl.edu.vistula.first_rest_api.product.support.exceptions.ProductNotFoundException;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> productNotFound(Long id) {
        return () -> new ProductNotFoundException(id);
    }
}
