package org.ouardia.projet_tousfi.repositories;

import org.ouardia.projet_tousfi.entities.BankAccount;
import org.ouardia.projet_tousfi.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
