package com.techzone.designpatterns.domains;

public enum Accounts {
    SAVING_ACCOUNT("Saving") {
        public Account getAccount() {
            return new SavingAccount();
        }
    },
    CURRENT_ACCOUNT("Current") {
        public Account getAccount() {
            return new CurrentAccount();
        }
    },
    NRI_ACCOUNT("NRI") {
        public Account getAccount() {
            return new NRIAccount();
        }
    };

    private final String accountType;

    Accounts(final String accountType) {
        this.accountType = accountType;
    }

    public abstract Account getAccount();

    public String getAccountType() {
        return accountType;
    }
}
