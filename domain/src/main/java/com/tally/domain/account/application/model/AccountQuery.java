package com.tally.domain.account.application.model;

import com.tally.domain.account.domain.entity.Account;

public class AccountQuery {

    public static class RegisterAccount {

        private final Long accountId;
        private final String email;

        public RegisterAccount(final Long accountId, final String email) {
            this.accountId = accountId;
            this.email = email;
        }

        public static RegisterAccount toQuery(final Account account) {
            return new RegisterAccount(account.getId(), account.getEmail());
        }

        public Long getAccountId() {
            return accountId;
        }
    }



}
