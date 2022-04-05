package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.CustomerDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public interface CustomerService extends Remote {

    CustomerDTO customerById(UUID uuid) throws RemoteException;

    List<CustomerDTO> customerListByIds(List<UUID> uuidList) throws RemoteException;

    List<CustomerDTO> search(String query) throws RemoteException;
}
