package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;

public class SaleItemDTO implements Serializable {
    private String productName;
    private String artistName;
    private String soundCarrierName;
    private int amountOfCarriers;
    private float pricePerCarrier;

    private SaleItemDTO() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private SaleItemDTO instance;

        public Builder() {
            this.instance = new SaleItemDTO();
        }

        public Builder withProductName(String productName) {
            this.instance.productName = productName;
            return this;
        }

        public Builder withArtistName(String artistName) {
            this.instance.artistName = artistName;
            return this;
        }

        public Builder withSoundCarrierName(String soundCarrierName) {
            this.instance.soundCarrierName = soundCarrierName;
            return this;
        }

        public Builder withAmountOfCarriers(int amountOfCarriers) {
            this.instance.amountOfCarriers = amountOfCarriers;
            return this;
        }

        public Builder withPricePerCarrier(float pricePerCarrier) {
            this.instance.pricePerCarrier = pricePerCarrier;
            return this;
        }

        public SaleItemDTO build() {
            return this.instance;
        }
    }

    public String getProductName() {
        return productName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSoundCarrierName() {
        return soundCarrierName;
    }

    public int getAmountOfCarriers() {
        return amountOfCarriers;
    }

    public float getPricePerCarrier() {
        return pricePerCarrier;
    }
}
