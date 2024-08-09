package com.tally.domain.account.domain.entity;

import com.tally.domain.common.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "accounts")
public class Account extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    protected Account() {}

    public Account(final String email, final String password) {
        this.email = email;
        this.password = password;
    }

    public static Account registered(final String email, final String password) {
        return new Account(email, password);
    }

}
