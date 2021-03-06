package com.godwyn.ahp_project.domain.enums;

public enum  ComparisonDefinitionEnum {
    EQUAL(0), TWEAK(1), STRONG(2),VERY_STRONG(3),ABSOLUTE(4),INTERMEDIARY(5);

    private final int mValue;

    ComparisonDefinitionEnum(int value) {
        mValue = value;
    }

    public int getValue(){
        return mValue;
    }
}
