package com.tally.domain.account.domain;

import com.tally.domain.account.domain.entity.Account;

public interface AccountRepository {

    Account save(final Account account);

}
