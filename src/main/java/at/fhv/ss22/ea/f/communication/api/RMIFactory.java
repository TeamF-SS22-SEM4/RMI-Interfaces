package at.fhv.ss22.ea.f.communication.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIFactory extends Remote {
    ProductSearchService getProductSearchService() throws RemoteException;

    BuyingService getBuyingService() throws RemoteException;

    SaleSearchService getSaleSearchService() throws RemoteException;

    RefundSaleService getRefundedSaleService() throws RemoteException;
}
