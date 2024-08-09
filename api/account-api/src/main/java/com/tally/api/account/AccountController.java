package com.tally.api.account;

import com.tally.api.account.model.request.AccountInputDto;
import com.tally.api.account.model.request.AccountInputDtoMapper;
import com.tally.api.account.model.response.AccountOutputDto;
import com.tally.api.account.model.response.AccountOutputDtoMapper;
import com.tally.domain.account.application.AccountService;
import com.tally.domain.account.application.model.AccountQuery;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {

    private final AccountService accountService;

    public AccountController(final AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/v1/auth/sign-up")
    public ResponseEntity<Long> register(@Valid @RequestBody final AccountInputDto.RegisterAccountRequest registerAccountRequest) {
        final AccountQuery.RegisterAccount registerAccount = accountService.signUp(AccountInputDtoMapper.toCommand(registerAccountRequest));
        final AccountOutputDto.RegisterAccountResponse registerAccountResponse = AccountOutputDtoMapper.toResponse(registerAccount);

        return ResponseEntity.ok(registerAccountResponse.getAccountId());
    }
}
