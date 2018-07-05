package com.godwyn.ahp_project.domain.enums;

public enum  AssistMethodsEnum {
    AHP(0), PROGRESSION(1), REGRESSION(2);

    private final int mValue;

    AssistMethodsEnum(int value) {
        mValue = value;
    }

    public int getValue(){
        return mValue;
    }

}
