package com.techzone.designpatterns.domains;

public class CurrentAccount implements Account {

    public int debitAmountLimit() {
        return 50000;
    }
}
