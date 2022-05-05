package at.fhv.ss22.ea.f.communication.api;


import at.fhv.ss22.ea.f.communication.dto.ProductDetailsDTO;
import at.fhv.ss22.ea.f.communication.dto.ProductOverviewDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import javax.ejb.Remote;
import java.util.List;
import java.util.UUID;

@Remote
public interface ProductSearchService {

    ProductDetailsDTO productById(UUID productId) throws SessionExpired, NoPermissionForOperation;

    List<ProductOverviewDTO> fullTextSearch(String query) throws SessionExpired, NoPermissionForOperation;
}
