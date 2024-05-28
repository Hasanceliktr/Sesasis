package org.hasanceliktr.sesasis.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    @OneToMany(mappedBy = "area",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<TrafoCenter> trafocenters;


    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TrafoCenter> getTrafocenters() {
        return trafocenters;
    }

    public void setTrafocenters(List<TrafoCenter> trafocenters) {
        this.trafocenters = trafocenters;
    }
}
