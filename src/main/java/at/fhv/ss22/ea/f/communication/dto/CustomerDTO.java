package at.fhv.ss22.ea.f.communication.dto;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class CustomerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID customerId;
    private String givenName;
    private String familyName;
    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;
    private String mobileNumber;
    private String creditCardType;
    private String creditCardNumber;
    private String cvc;

    private CustomerDTO() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private CustomerDTO customer;
        Builder() {
            this.customer = new CustomerDTO();
        }

        public CustomerDTO build() {
            Objects.requireNonNull(this.customer.customerId, "CustomerDTO requires an ID");
            return this.customer;
        }

        public Builder id(UUID id) {
            this.customer.customerId = id;
            return this;
        }

        public Builder givenName(String name) {
            this.customer.givenName = name;
            return this;
        }
        public Builder familyName(String name) {
            this.customer.familyName = name;
            return this;
        }
        public Builder street(String street) {
            this.customer.street = street;
            return this;
        }
        public Builder houseNumber(String houseNumber) {
            this.customer.houseNumber = houseNumber;
            return this;
        }
        public Builder postalCode(String postalCode) {
            this.customer.postalCode = postalCode;
            return this;
        }
        public Builder city(String city) {
            this.customer.city = city;
            return this;
        }
        public Builder country(String country) {
            this.customer.country = country;
            return this;
        }
        public Builder email(String email) {
            this.customer.email = email;
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.customer.phoneNumber = phoneNumber;
            return this;
        }
        public Builder mobileNumber(String mobileNumber) {
            this.customer.mobileNumber = mobileNumber;
            return this;
        }

        public Builder creditCardType(String creditCardType) {
            this.customer.creditCardType = creditCardType;
            return this;
        }

        public Builder creditCardNumber(String creditCardNumber) {
            this.customer.creditCardNumber = creditCardNumber;
            return this;
        }

        public Builder cvc(String cvc) {
            this.customer.cvc = cvc;
            return this;
        }
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCvc() {
        return cvc;
    }
}
