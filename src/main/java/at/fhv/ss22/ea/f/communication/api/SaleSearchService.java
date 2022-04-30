package at.fhv.ss22.ea.f.communication.api;

import at.fhv.ss22.ea.f.communication.dto.SaleDTO;
import at.fhv.ss22.ea.f.communication.exception.NoPermissionForOperation;
import at.fhv.ss22.ea.f.communication.exception.SessionExpired;

import javax.ejb.Remote;

@Remote
public interface SaleSearchService {
    SaleDTO saleByInvoiceNumber(String sessionId, String invoiceNumber) throws SessionExpired, NoPermissionForOperation;
}