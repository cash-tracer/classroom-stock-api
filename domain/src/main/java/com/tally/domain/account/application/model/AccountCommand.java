package com.tally.domain.account.application.model;

import lombok.Getter;

public class AccountCommand {

    @Getter
    public static class RegisterAccount {

        private final String email;
        private final String password;

        public RegisterAccount(final String email, final String password) {
            this.email = email;
            this.password = password;
        }

    }
}
