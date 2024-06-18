package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}