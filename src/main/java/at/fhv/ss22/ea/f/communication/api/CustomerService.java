package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.CustomerDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import javax.ejb.Remote;
import java.util.List;
import java.util.UUID;

@Remote
public interface CustomerService {

    CustomerDTO customerById(String sessionId, UUID uuid) throws SessionExpired, NoPermissionForOperation;

    List<CustomerDTO> customerListByIds(String sessionId, List<UUID> uuidList) throws SessionExpired, NoPermissionForOperation;

    List<CustomerDTO> search(String sessionId, String query) throws SessionExpired, NoPermissionForOperation;
}
