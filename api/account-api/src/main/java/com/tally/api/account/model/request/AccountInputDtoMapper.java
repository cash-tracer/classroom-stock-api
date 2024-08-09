package com.tally.api.account.model.request;

import com.tally.domain.account.application.model.AccountCommand;

public class AccountInputDtoMapper {

    private AccountInputDtoMapper() {}

    public static AccountCommand.RegisterAccount toCommand(final AccountInputDto.RegisterAccountRequest request) {
        return new AccountCommand.RegisterAccount(request.getEmail(), request.getPassword());
    }
}
