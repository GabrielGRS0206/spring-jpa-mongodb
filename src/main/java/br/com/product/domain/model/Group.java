package br.com.product.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Group {

    @Id
    private String id;
    private String name;
    private String observation;

    public Group(String id) {
        this.id = id;
    }

    public Group() {
        super();
    }
}
