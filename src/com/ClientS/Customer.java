package com.ClientS;

public class Customer {
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phoneNumber;
    private String creditCardNumber;
    private String bankAccountNumber;

    public Customer(String lastName, String firstName, String middleName, String address,
                    String phoneNumber, String creditCardNumber, String bankAccountNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lastName='" + lastName + '\'' +
        ", firstName='" + firstName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", creditCardNumber='" + creditCardNumber + '\'' +
        ", bankAccountNumber='" + bankAccountNumber + '\'' +
        '}';
    }
}
