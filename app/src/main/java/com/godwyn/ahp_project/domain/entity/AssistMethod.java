package com.godwyn.ahp_project.domain.entity;

import java.io.Serializable;

public class AssistMethod implements Serializable
{
    private String mTitle;
    private String mDescription;
    private int mMethodId;

    public AssistMethod(String title, String description, int methodId) {
        this.mTitle      = title;
        this.mDescription = description;
        this.mMethodId = methodId;
    }

    public int getMethodId() {
        return mMethodId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }
}
