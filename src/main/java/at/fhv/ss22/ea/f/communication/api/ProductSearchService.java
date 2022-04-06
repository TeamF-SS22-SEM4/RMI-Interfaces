package at.fhv.ss22.ea.f.communication.api;


import at.fhv.ss22.ea.f.communication.dto.ProductDetailsDTO;
import at.fhv.ss22.ea.f.communication.dto.ProductOverviewDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface ProductSearchService extends Remote {

    ProductDetailsDTO productById(String sessionId, UUID productId) throws RemoteException, SessionExpired, NoPermissionForOperation;

    List<ProductOverviewDTO> fullTextSearch(String sessionId, String query) throws RemoteException, SessionExpired, NoPermissionForOperation;
}
