package at.fhv.ss22.ea.f.communication.dto;

import java.util.UUID;

public class ShoppingCartProductDTO {
    private UUID productId;
    private UUID soundCarrierId;
    private String productName;
    private String artistName;
    private int selectedAmount;
    private String carrierName;
    private float pricePerCarrier;
    private float totalProductPrice;

    private ShoppingCartProductDTO() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ShoppingCartProductDTO instance;

        public Builder() {
            this.instance = new ShoppingCartProductDTO();
        }

        public Builder withProductId(UUID productId) {
            this.instance.productId = productId;
            return this;
        }

        public Builder withSoundCarrierId(UUID soundCarrierId) {
            this.instance.soundCarrierId = soundCarrierId;
            return this;
        }

        public Builder withProductName(String productName) {
            this.instance.productName = productName;
            return this;
        }

        public Builder withArtistName(String artistName) {
            this.instance.artistName = artistName;
            return this;
        }

        public Builder withSelectedAmount(int selectedAmount) {
            this.instance.selectedAmount = selectedAmount;
            return this;
        }

        public Builder withCarrierName(String carrierName) {
            this.instance.carrierName = carrierName;
            return this;
        }

        public Builder withPricePerCarrier(float pricePerCarrier) {
            this.instance.pricePerCarrier = pricePerCarrier;
            return this;
        }

        public Builder withTotalProductPrice(float totalProductPrice) {
            this.instance.totalProductPrice = totalProductPrice;
            return this;
        }

        public ShoppingCartProductDTO build() {
            return this.instance;
        }
    }

    public UUID getProductId() {
        return productId;
    }

    public UUID getSoundCarrierId() {
        return soundCarrierId;
    }

    public String getProductName() {
        return productName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getSelectedAmount() {
        return selectedAmount;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public float getPricePerCarrier() {
        return pricePerCarrier;
    }

    public float getTotalProductPrice() {
        return totalProductPrice;
    }
}
