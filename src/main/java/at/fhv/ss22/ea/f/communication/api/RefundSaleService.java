package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.RefundedSaleItemDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RefundSaleService extends Remote {
    void refundSale(String invoiceNumber, List<RefundedSaleItemDTO> refundedSaleItems) throws RemoteException;
}
