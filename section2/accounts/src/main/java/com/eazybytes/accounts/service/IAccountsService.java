package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * This method will create a new account for the given customer
     * @param customerDto contains the customer information
     */
    void createAccount(CustomerDto customerDto);

    /**
     * This method will fetch the account details for the given mobile number
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

}
