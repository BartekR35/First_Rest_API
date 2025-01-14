package pl.edu.vistula.first_rest_api.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

//class responsible for receiving requests
public class ProductRequest {

    private final String name;

    @JsonCreator
    public ProductRequest(String name) {
        this.name = name;};

    public String getName() {
        return name; }

}
