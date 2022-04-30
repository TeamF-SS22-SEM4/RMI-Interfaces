package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.RefundedSaleItemDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface RefundSaleService {
    void refundSale(String sessionId, String invoiceNumber, List<RefundedSaleItemDTO> refundedSaleItems) throws SessionExpired, NoPermissionForOperation;
}
