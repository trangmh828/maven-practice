package org.example;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTest1 {
    @Test
    public void verify_Trang123456a$_is_password() {
        Assert.assertTrue(Homework1.isPassword("Trang123456$"));
    }

    // password is less than 8 characters
    @Test
    public void verify_Tran1a$_is_not_password() {
        Assert.assertFalse(Homework1.isPassword("Trang1$"));
    }

    // password is equal to 8 characters
    @Test
    public void verify_Tran123$_is_not_password() {
        Assert.assertFalse(Homework1.isPassword("Trang12$"));
    }

    // password doesn't include numbers
    @Test
    public void verify_Trangtester$_is_not_password() {
        Assert.assertFalse(Homework1.isPassword("Trangtester$"));
    }

    // password doesn't include lowercases
    @Test
    public void verify_TRANG1234$_is_not_password() {
        Assert.assertFalse(Homework1.isPassword("TRANG1234$"));
    }

    // password doesn't include uppercases
    @Test
    public void verify_trang1234$_is_not_password() {
        Assert.assertFalse(Homework1.isPassword("trang1234$"));
    }

    // password doesn't include !@#$%^&*()
    @Test
    public void verify_trang1234_is_not_password() {
        Assert.assertFalse(Homework1.isPassword("Trang123456"));
    }
}
