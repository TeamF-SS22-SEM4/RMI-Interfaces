package at.fhv.ss22.ea.f.communication.api;

import java.io.Serializable;

public class ProductOverviewDTO implements Serializable {
    private String name;

    public ProductOverviewDTO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "P: " + this.name;
    }
}
