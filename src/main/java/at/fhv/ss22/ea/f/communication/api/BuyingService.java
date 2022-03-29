package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.SoundCarrierAmountDTO;
import at.fhv.ss22.ea.f.communication.exception.CarrierNotAvailableException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface BuyingService extends Remote {

    /**@param soundCarriers A list of id's of sound carriers and amount which will be bought.
     * @param paymentMethod The name of the method with which the sale is paid.
     * @return The Sale-Id corresponding to the sale that was just completed.
     * @throws CarrierNotAvailableException If an invalid id was given or too large an amount.
     * @throws RemoteException
     */
    UUID buy(List<SoundCarrierAmountDTO> soundCarriers, String paymentMethod) throws CarrierNotAvailableException, RemoteException;

}