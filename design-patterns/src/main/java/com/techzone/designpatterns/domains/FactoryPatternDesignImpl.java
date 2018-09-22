package com.techzone.designpatterns.domains;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public final class FactoryPatternDesignImpl {

    private static final Logger LOGGER = Logger.getLogger(FactoryPatternDesignImpl.class.getName());

    private static final Map<String, Accounts> accountsHolder = new ConcurrentHashMap<>();

    static {
        accountsHolder.put("Saving", Accounts.SAVING_ACCOUNT);
        accountsHolder.put("Current", Accounts.CURRENT_ACCOUNT);
        accountsHolder.put("NRI", Accounts.NRI_ACCOUNT);
    }

    private FactoryPatternDesignImpl() {
        throw new AssertionError("INSTANCE CREATION OF FACTORY NOT ALLOWED.");
    }

    public static void execute() {
        accountsHolder.forEach((key, value) -> LOGGER.info("In " + value.getAccountType() + " Acount amount debit limit is :: " + value.getAccount().debitAmountLimit()));

    }

}
