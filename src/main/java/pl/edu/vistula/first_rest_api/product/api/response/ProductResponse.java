package pl.edu.vistula.first_rest_api.product.api.response;

//class responsible for responding HTTP answers
public class ProductResponse {

    private final Long id;
    private final String name;

    public ProductResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //response
    public String getName() {
        return name;}

}
