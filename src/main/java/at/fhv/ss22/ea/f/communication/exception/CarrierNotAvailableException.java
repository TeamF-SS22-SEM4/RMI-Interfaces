package at.fhv.ss22.ea.f.communication.exception;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class CarrierNotAvailableException extends Exception implements Serializable {
    private List<UUID> unavailableCarriers;

    public CarrierNotAvailableException(List<UUID> unavailableCarriers) {
        this.unavailableCarriers = unavailableCarriers;
    }

    public List<UUID> getUnavailableCarriers() {
        return unavailableCarriers;
    }
}