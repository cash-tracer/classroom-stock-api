package com.tally.api.account.model.response;

import com.tally.domain.account.application.model.AccountQuery;

public class AccountOutputDtoMapper {

    private AccountOutputDtoMapper() {}

    public static AccountOutputDto.RegisterAccountResponse toResponse(final AccountQuery.RegisterAccount accountOutputDto) {
        return new AccountOutputDto.RegisterAccountResponse(accountOutputDto.getAccountId());
    }
}
