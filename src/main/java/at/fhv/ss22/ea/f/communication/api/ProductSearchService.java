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

    // String sessionId, UUID productId
    ProductDetailsDTO productById(UUID productId) throws RemoteException, SessionExpired, NoPermissionForOperation;

    // String sessionId, String query
    List<ProductOverviewDTO> fullTextSearch(String query) throws RemoteException, SessionExpired, NoPermissionForOperation;
}
