package pl.edu.vistula.first_rest_api.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//class represents subject of the project
@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Product() {
    }

    //class constructors
    public Product(String name) {this.name = name;}

    public Long getId() {return id;}

    public String getName() {return name;}

    public void setId(Long id) {this.id = id;}

    public void setName(String name) {this.name = name;}
}
