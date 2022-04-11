package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.UUID;

public class RefundedSaleItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID soundCarrierId;
    private int amountToRefund;

    private RefundedSaleItemDTO() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private RefundedSaleItemDTO instance;

        public Builder() {
            this.instance = new RefundedSaleItemDTO();
        }

        public Builder withSoundCarrierId(UUID soundCarrierId) {
            this.instance.soundCarrierId = soundCarrierId;
            return this;
        }

        public Builder withAmountToRefund(int amountToRefund) {
            this.instance.amountToRefund = amountToRefund;
            return this;
        }

        public RefundedSaleItemDTO build() {
            return this.instance;
        }
    }

    public UUID getSoundCarrierId() {
        return soundCarrierId;
    }

    public int getAmountToRefund() {
        return amountToRefund;
    }
}
