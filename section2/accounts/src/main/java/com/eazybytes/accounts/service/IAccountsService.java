package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.*;

public interface IAccountsService {

    public void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount (String mobileNumber);

    boolean updateAccount (CustomerDto customerDto);

    boolean deleteAccount (String mobileNumber);
}
