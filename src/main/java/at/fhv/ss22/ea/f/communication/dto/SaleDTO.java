package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.List;

public class SaleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String invoiceNumber;
    private List<SaleItemDTO> saleItems;
    private double totalPrice;
    private String dateOfSale;

    private SaleDTO() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private SaleDTO instance;

        public Builder() {
            this.instance = new SaleDTO();
        }

        public Builder withInvoiceNumber(String invoiceNumber) {
            this.instance.invoiceNumber = invoiceNumber;
            return this;
        }

        public Builder withSaleItems(List<SaleItemDTO> saleItems) {
            this.instance.saleItems = saleItems;
            return this;
        }

        public Builder withTotalPrice(double totalPrice) {
            this.instance.totalPrice = totalPrice;
            return this;
        }

        public Builder withDateOfSale(String date) {
            this.instance.dateOfSale = date;
            return this;
        }

        public SaleDTO build() {
            return this.instance;
        }
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public List<SaleItemDTO> getSaleItems() {
        return saleItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }
}
