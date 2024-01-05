package com.example.is_project2.model;

import jakarta.persistence.Entity;

import java.util.*;

public enum Role {

    CUSTOMER("Customer"),
    EMPLOYEE("Employee"),
    ADMINISTRATOR("Administrator");

    private final String displayName;

    Role(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}