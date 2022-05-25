package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DigitalProductPurchasedDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;

    private String albumName;
    private List<SongDTO> purchasedSongs;

    private String artists;

    private DigitalProductPurchasedDTO() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private DigitalProductPurchasedDTO instance;

        public Builder() {
            this.instance = new DigitalProductPurchasedDTO();
        }

        public Builder withUsername(String username) {
            this.instance.username = username;
            return this;
        }

        public Builder withAlbumName(String albumName) {
            this.instance.albumName = albumName;
            return this;
        }

        public Builder withPurchasedSongs(List<SongDTO> songs) {
            this.instance.purchasedSongs = songs;
            return this;
        }

        public Builder withArtists(String artists) {
            this.instance.artists = artists;
            return this;
        }

        public DigitalProductPurchasedDTO build() {
            Objects.requireNonNull(this.instance.username, "username must be set in DigitalProductPurchasedDTO");
            Objects.requireNonNull(this.instance.albumName, "albumName must be set in DigitalProductPurchasedDTO");
            Objects.requireNonNull(this.instance.purchasedSongs, "purchasedSongs must be set in DigitalProductPurchasedDTO");

            return this.instance;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getAlbumName() {
        return albumName;
    }

    public List<SongDTO> getPurchasedSongs() {
        return purchasedSongs;
    }

    public String getArtists() {
        return artists;
    }
}
