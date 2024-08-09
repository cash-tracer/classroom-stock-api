package com.tally.api.account.model.response;

public class AccountOutputDto {

    public static class RegisterAccountResponse {

        private final Long accountId;

        public RegisterAccountResponse(final Long accountId) {
            this.accountId = accountId;
        }

        public Long getAccountId() {
            return accountId;
        }

    }
}
