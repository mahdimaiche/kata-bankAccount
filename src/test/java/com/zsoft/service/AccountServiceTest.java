package com.zsoft.service;

import com.zsoft.domain.Account;
import com.zsoft.domain.Client;
import com.zsoft.domain.Transaction;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountServiceTest {

    AccountService accountService = new AccountService();

    @Test
    public void createAccount() throws Exception {

        Account account = new Account();
        account.setNumber("1234");
        account.setBalance(1500);

        account.getTransactions().add(new Transaction());
        account.getTransactions().add(new Transaction());

        accountService.createAccount(account);

        Account accountGet = Client.getInstance().getAccounts().get("1234");

        assertEquals(accountGet.getNumber(), "1234");
        assertEquals(accountGet.getBalance(), 1500,0);
        assertEquals(2, accountGet.getTransactions().size());
    }

    @Test
    public void deleteAccount() throws Exception {
        fail("Not implemented");
    }

    @Test
    public void updateAccount() throws Exception {
        fail("Not implemented");
    }

    @Test
    public void getAccount() throws Exception {
        fail("Not implemented");
    }
    @Test
    public void deposit() throws Exception {
        fail("Not implemented");
    }
    @Test
    public void withdraw() throws Exception {
        fail("Not implemented");
    }
}