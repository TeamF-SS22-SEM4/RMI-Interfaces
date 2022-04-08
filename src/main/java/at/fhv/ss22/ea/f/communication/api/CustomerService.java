package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.CustomerDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface CustomerService extends Remote {

    // String sessionId, UUID uuid
    CustomerDTO customerById(UUID uuid) throws RemoteException, SessionExpired, NoPermissionForOperation;

    // String sessionId, List<UUID> uuidList
    List<CustomerDTO> customerListByIds(List<UUID> uuidList) throws RemoteException, SessionExpired, NoPermissionForOperation;

    // String sessionId, String query
    List<CustomerDTO> search(String query) throws RemoteException, SessionExpired, NoPermissionForOperation;
}
