package umc.study.entity;

import javax.persistence.*;

@Entity
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @ManyToOne(optional = false)
    private Store store;

    public Mission() {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Store getStore() {
        return store;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}