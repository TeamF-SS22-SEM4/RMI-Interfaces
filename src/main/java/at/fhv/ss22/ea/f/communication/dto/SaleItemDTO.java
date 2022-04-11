package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.UUID;

public class SaleItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String productName;
    private String artistName;
    private UUID soundCarrierId;
    private String soundCarrierName;
    private int amountOfCarriers;
    private float pricePerCarrier;
    private int refundedAmount;

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

        public Builder withSoundCarrierId(UUID soundCarrierId) {
            this.instance.soundCarrierId = soundCarrierId;
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

        public Builder withRefundedAmount(int refundedAmount) {
            this.instance.refundedAmount = refundedAmount;
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

    public UUID getSoundCarrierId() {
        return soundCarrierId;
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

    public int getRefundedAmount() {
        return refundedAmount;
    }
}
