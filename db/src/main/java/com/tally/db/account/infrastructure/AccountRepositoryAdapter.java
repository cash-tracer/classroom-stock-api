package com.tally.db.account.infrastructure;

import com.tally.db.account.infrastructure.persistence.AccountJpaRepository;
import com.tally.domain.account.domain.AccountRepository;
import com.tally.domain.account.domain.entity.Account;
import com.tally.domain.common.annotation.Adapter;
import org.springframework.transaction.annotation.Transactional;

@Adapter
public class AccountRepositoryAdapter implements AccountRepository {

    private final AccountJpaRepository accountJpaRepository;

    public AccountRepositoryAdapter(final AccountJpaRepository accountJpaRepository) {
        this.accountJpaRepository = accountJpaRepository;
    }

    @Transactional
    @Override
    public Account save(final Account account) {
        return accountJpaRepository.save(account);
    }
}
