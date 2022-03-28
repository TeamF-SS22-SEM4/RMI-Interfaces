package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.UUID;

public class SoundCarrierDTO implements Serializable {
    private UUID soundCarrierId;
    private String soundCarrierName;
    private int amountAvailable;
    private float pricePerCarrier;

    private SoundCarrierDTO() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private SoundCarrierDTO instance;

        public Builder() {
            this.instance = new SoundCarrierDTO();
        }

        public Builder withSoundCarrierId(UUID soundCarrierId) {
            this.instance.soundCarrierId = soundCarrierId;
            return this;
        }

        public Builder withSoundCarrierName(String name) {
            this.instance.soundCarrierName = name;
            return this;
        }

        public Builder withAvailableAmount(int amount) {
            this.instance.amountAvailable = amount;
            return this;
        }

        public Builder withPricePerCarrier(float price) {
            this.instance.pricePerCarrier = price;
            return this;
        }

        public SoundCarrierDTO build() {
            return this.instance;
        }
    }

    public UUID getSoundCarrierId() {
        return soundCarrierId;
    }

    public String getSoundCarrierName() {
        return soundCarrierName;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public float getPricePerCarrier() {
        return pricePerCarrier;
    }
}
