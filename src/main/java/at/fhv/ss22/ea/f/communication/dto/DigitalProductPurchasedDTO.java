package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DigitalProductPurchasedDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userId;

    private String albumName;
    private List<SongDTO> purchasedSongs;
    private List<String> artistNames;

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

        public Builder withUserId(String userId) {
            this.instance.userId = userId;
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

        public Builder withArtistNames(List<String> artistNames) {
            this.instance.artistNames = artistNames;
            return this;
        }

        public DigitalProductPurchasedDTO build() {
            Objects.requireNonNull(this.instance.userId, "userId must be set in DigitalProductPurchasedDTO");
            Objects.requireNonNull(this.instance.albumName, "albumName must be set in DigitalProductPurchasedDTO");
            Objects.requireNonNull(this.instance.purchasedSongs, "purchasedSongs must be set in DigitalProductPurchasedDTO");
            Objects.requireNonNull(this.instance.artistNames, "artistName must be set in DigitalProductPurchasedDTO");

            return this.instance;
        }
    }

    public String getUserId() {
        return userId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public List<SongDTO> getPurchasedSongs() {
        return purchasedSongs;
    }

    public List<String> getArtistNames() {
        return artistNames;
    }
}
