package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.SoundCarrierOrderDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import javax.ejb.Remote;

@Remote
public interface OrderingService {

    boolean placeOrder(String sessionId, SoundCarrierOrderDTO orderDTO) throws SessionExpired, NoPermissionForOperation;

    boolean approveOrder(String sessionId, SoundCarrierOrderDTO orderDTO) throws SessionExpired, NoPermissionForOperation;

}
