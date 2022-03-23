package at.fhv.ss22.ea.f.communication.api;


import at.fhv.ss22.ea.f.communication.dto.ProductDetailsDTO;
import at.fhv.ss22.ea.f.communication.dto.ProductOverviewDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface ProductSearchService extends Remote {

    ProductDetailsDTO productById(UUID productId) throws RemoteException;

    List<ProductOverviewDTO> fullTextSearch(String query) throws RemoteException;
}
