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

    /**
     * This method will update the account details for the given mobile number
     *
     * @param customerDto contains the customer information
     * @return boolean value indicating the success of the operation
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * This method will delete the account details for the given mobile number
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean value indicating the success of the operation
     */
    boolean deleteAccount(String mobileNumber);

    /**
     *
     * @param accountNumber - Long
     * @return boolean value indicating if the update of communication status is successful or not
     */
    boolean updateCommunicationStatus(Long accountNumber);

}
