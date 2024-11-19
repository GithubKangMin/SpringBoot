package umc.study.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @OneToMany(mappedBy="region")
    private List<Store> stores;

    public Region() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}