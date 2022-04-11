package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.UUID;

public class SoundCarrierAmountDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int amount;
    private UUID carrierId;

    public int getAmount() {
        return amount;
    }
    public UUID getCarrierId() {
        return carrierId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private SoundCarrierAmountDTO instance = new SoundCarrierAmountDTO();

        public Builder withAmount(int amount) {
            this.instance.amount = amount;
            return this;
        }
        public Builder withCarrierId(UUID carrierId) {
            this.instance.carrierId = carrierId;
            return this;
        }
        public SoundCarrierAmountDTO build() {
            return this.instance;
        }
    }

}
