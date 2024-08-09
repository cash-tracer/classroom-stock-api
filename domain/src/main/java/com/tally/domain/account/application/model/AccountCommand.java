package com.tally.domain.account.application.model;

public class AccountCommand {

    public static class RegisterAccount {

        private final String email;
        private final String password;

        public RegisterAccount(final String email, final String password) {
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }
    }
}
