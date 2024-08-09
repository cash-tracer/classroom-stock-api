CREATE TABLE classrooms (
    classroom_id   BIGSERIAL PRIMARY KEY,
    classroom_name VARCHAR(50) NOT NULL,
    classroom_code VARCHAR(16) NOT NULL,
    teacher_id     BIGINT      NOT NULL,
    school_code    VARCHAR(16) NOT NULL,
    created_at     TIMESTAMP   NOT NULL,
    updated_at     TIMESTAMP   NOT NULL
);

COMMENT ON TABLE classrooms IS '반 테이블';
COMMENT ON COLUMN classrooms.classroom_id IS '강의실 ID';
COMMENT ON COLUMN classrooms.classroom_name IS '반 이름';
COMMENT ON COLUMN classrooms.classroom_code IS '반 코드';
COMMENT ON COLUMN classrooms.teacher_id IS '선생님 ID';
COMMENT ON COLUMN classrooms.school_code IS '학교 코드';
COMMENT ON COLUMN classrooms.created_at IS '반 생성일시';
COMMENT ON COLUMN classrooms.updated_at IS '반 수정일시';

ALTER TABLE classrooms ADD CONSTRAINT uix_classroom_code UNIQUE (classroom_code);