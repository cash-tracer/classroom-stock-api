CREATE TABLE accounts (
    account_id BIGSERIAL PRIMARY KEY,
    email      VARCHAR(50)  NOT NULL,
    password   VARCHAR(100) NOT NULL,
    created_at TIMESTAMP    NOT NULL,
    updated_at TIMESTAMP    NOT NULL
);

COMMENT ON TABLE accounts IS '사용자 테이블';
COMMENT ON COLUMN accounts.account_id IS '사용자 ID';
COMMENT ON COLUMN accounts.email IS '사용자 이메일';
COMMENT ON COLUMN accounts.password IS '사용자 비밀번호';
COMMENT ON COLUMN accounts.created_at IS '사용자 생성일시';
COMMENT ON COLUMN accounts.updated_at IS '사용자 수정일시';

ALTER TABLE accounts ADD CONSTRAINT uix_email UNIQUE (email);