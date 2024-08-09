package com.tally.db.account.infrastructure.persistence;

import com.tally.domain.account.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepository extends JpaRepository<Account, Long> {
}
