package org.fastcampus.student_management.domain;

public class Fee {
    private final int fee;

    public Fee(int fee) {
        if (fee < 0) {
            throw new RuntimeException("수강료는 음수일 수 없습니다.");
        }
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
