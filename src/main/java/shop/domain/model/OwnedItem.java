package shop.domain.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;

@Entity
public class OwnedItem {

    @Id
    private Long id;

    private String imageUrl;

    @NotBlank
    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    private User owner;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}