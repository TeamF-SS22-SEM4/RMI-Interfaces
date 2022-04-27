package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class DetailedOrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID orderId;
    private String productName;
    private UUID soundCarrierId;
    private String carrierType;
    private String employeeName;

    private int amount;

    private DetailedOrderDTO() {}

    public UUID getOrderId() {
        return orderId;
    }

    public UUID getSoundCarrierId() {
        return soundCarrierId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCarrierType() {
        return carrierType;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAmount() {
        return amount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final DetailedOrderDTO instance;

        public Builder() {
            this.instance = new DetailedOrderDTO();
        }

        public Builder withProductName(String productName) {
            this.instance.productName = productName;
            return this;
        }
        public Builder withEmployeeName(String name) {
            this.instance.employeeName = name;
            return this;
        }
        public Builder withCarrierType(String type) {
            this.instance.carrierType = type;
            return this;
        }
        public Builder withOrderId(UUID uuid) {
            this.instance.orderId = uuid;
            return this;
        }
        public Builder withCarrierId(UUID carrierId) {
            this.instance.soundCarrierId = carrierId;
            return this;
        }
        public Builder withAmount(int amount) {
            this.instance.amount = amount;
            return this;
        }
        public DetailedOrderDTO build() {
            Objects.requireNonNull(this.instance.orderId);
            return this.instance;
        }
    }
}
