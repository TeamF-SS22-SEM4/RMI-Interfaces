package at.fhv.ss22.ea.f.communication.api;

public class ProductOverviewDTO {
    private String name;

    public ProductOverviewDTO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "P: " + this.name;
    }
}
