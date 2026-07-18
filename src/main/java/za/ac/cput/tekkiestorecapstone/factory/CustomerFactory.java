package za.ac.cput.tekkiestorecapstone.factory;

import za.ac.cput.tekkiestorecapstone.domain.Address;
import za.ac.cput.tekkiestorecapstone.domain.Customer;
import za.ac.cput.tekkiestorecapstone.domain.Name;
import za.ac.cput.tekkiestorecapstone.util.Helper;

public class CustomerFactory {

    public static Customer createCustomer(
            String customerId,
            String firstName,
            String middleName,
            String lastName,
            String email,
            String mobileNumber,
            String streetNumber,
            String streetName,
            String suburb,
            String city,
            String postalCode) {

        if (Helper.isNullOrEmpty(customerId)
                || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(email)
                || Helper.isNullOrEmpty(mobileNumber)
                || Helper.isNullOrEmpty(streetNumber)
                || Helper.isNullOrEmpty(streetName)
                || Helper.isNullOrEmpty(suburb)
                || Helper.isNullOrEmpty(city)
                || Helper.isNullOrEmpty(postalCode)) {
            return null;
        }

        // Validates the email
        if (!Helper.isValidEmail(email)) {
            return null;
        }

        // Create a Name value object
        Name name = new Name.Builder()
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();

        // Create an Address value object
        Address address = new Address.Builder()
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setPostalCode(postalCode)
                .build();

        // Create a Customer entity
        return new Customer.Builder()
                .setCustomerId(customerId)
                .setName(name)
                .setEmail(email)
                .setMobileNumber(mobileNumber)
                .setAddress(address)
                .build();
    }
}