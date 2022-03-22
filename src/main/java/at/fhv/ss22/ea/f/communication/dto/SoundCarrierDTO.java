package at.fhv.ss22.ea.f.communication.dto;

public class SoundCarrierDTO {
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
