package com.hiyongz.dao.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum GenderEnum {
    MALE(1, "男"),
    FEMALE(2, "女");

    @EnumValue
    private Integer gender;
    private String genderName;
    GenderEnum(Integer gender, String genderName) {
        this.gender     = gender;
        this.genderName = genderName;
    }
}


