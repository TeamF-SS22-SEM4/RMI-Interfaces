package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ProductOverviewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID productId;
    private String name;
    private String artistName;
    private String releaseYear;

    // Private constructor so the builder is required to create an object
    private ProductOverviewDTO() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final ProductOverviewDTO instance;

        private Builder() {
            this.instance = new ProductOverviewDTO();
        }

        public Builder withId(UUID id) {
            this.instance.productId = id;
            return this;
        }

        public Builder withName(String name) {
            this.instance.name = name;
            return this;
        }

        public Builder withArtistName(String artistName) {
            this.instance.artistName = artistName;
            return this;
        }

        public Builder withReleaseYear(String releaseYear) {
            this.instance.releaseYear = releaseYear;
            return this;
        }

        public ProductOverviewDTO build() {
            Objects.requireNonNull(this.instance.name, "name must be set in ProductOverviewDTO");
            Objects.requireNonNull(this.instance.artistName, "artistFirstname must be set in ProductOverviewDTO");
            Objects.requireNonNull(this.instance.releaseYear, "releaseYear must be set in ProductOverviewDTO");

            return this.instance;
        }
    }

    public UUID getProductId() {
        return productId;
    }

    public String getName() {
        return this.name;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public String getReleaseYear() {
        return this.releaseYear;
    }
}
