package com.godwyn.ahp_project.domain.entity;

import java.io.Serializable;

public class Criterion implements Serializable {

    private final String mGuid;
    private String mTitle;

    public Criterion(String guid, String title) {
        this.mGuid      = guid;
        this.mTitle     = title;
    }

    public String getGuid() {
        return mGuid;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
