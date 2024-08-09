package com.tally.api.account.model.request;

public class AccountInputDto {

    public static class RegisterAccountRequest {

        private String email;
        private String password;

        public RegisterAccountRequest() {}

        public RegisterAccountRequest(final String email, final String password) {
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
