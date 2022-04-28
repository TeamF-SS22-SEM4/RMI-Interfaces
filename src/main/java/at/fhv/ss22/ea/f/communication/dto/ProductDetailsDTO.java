package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ProductDetailsDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID productId;
    private String name;
    private String artistName;
    private String releaseYear;
    private String labelName;
    private String genre;
    private String duration;
    private List<SongDTO> songs;
    private List<SoundCarrierDTO> soundCarriers;

    private ProductDetailsDTO() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ProductDetailsDTO instance;

        public Builder() {
            this.instance = new ProductDetailsDTO();
        }

        public Builder withSoundCarriers(List<SoundCarrierDTO> soundCarriers) {
            this.instance.soundCarriers = soundCarriers;
            return this;
        }

        public Builder withId(UUID id) {
            this.instance.productId = id;
            return this;
        }

        public Builder withName(String name) {
            this.instance.name = name;
            return this;
        }

        public Builder withArtistName(String name) {
            this.instance.artistName = name;
            return this;
        }

        public Builder withReleaseYear(String year) {
            this.instance.releaseYear = year;
            return this;
        }

        public Builder withLabelName(String labelName) {
            this.instance.labelName = labelName;
            return this;
        }

        public Builder withGenre(String genre) {
            this.instance.genre = genre;
            return this;
        }

        public Builder withDuration(String duration) {
            this.instance.duration = duration;
            return this;
        }

        public Builder withSongs(List<SongDTO> songs) {
            this.instance.songs = songs;
            return this;
        }

        public ProductDetailsDTO build() {
            Objects.requireNonNull(this.instance.productId, "productId must be set in ProductDetailsDTO");
            return this.instance;
        }
    }

    public UUID getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getLabelName() {
        return labelName;
    }

    public String getGenre() {
        return genre;
    }

    public String getDuration() {
        return duration;
    }

    public List<SongDTO> getSongs() {
        return songs;
    }

    public List<SoundCarrierDTO> getSoundCarriers() {
        return soundCarriers;
    }

}
