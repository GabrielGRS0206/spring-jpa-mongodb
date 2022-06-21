package br.com.product.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal value;

    @DBRef
    private Group group;

}
