package com.eazybytes.accounts.functions;

import com.eazybytes.accounts.service.*;
import org.slf4j.*;
import org.springframework.context.annotation.*;

import java.util.function.*;

@Configuration
public class AccountsFunctions {

    private static final Logger log = LoggerFactory.getLogger(AccountsFunctions.class);

    @Bean
    public Consumer<Long> updateCommunication (IAccountsService accountsService) {
        return accountNumber -> {
            log.info("Updating Communication status for the account number : " + accountNumber.toString());
            accountsService.updateCommunicationStatus(accountNumber);
        };
    }

}