package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.SaleDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaleSearchService extends Remote {
    // String sessionId, String invoiceNumber
    SaleDTO saleByInvoiceNumber(String invoiceNumber) throws RemoteException, SessionExpired, NoPermissionForOperation;
}
