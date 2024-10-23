package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VowelTest {
    @Test
    public void verify_u_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("u"));
    }

    @Test
    public void verify_e_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("e"));
    }

    @Test
    public void verify_o_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("o"));
    }

    @Test
    public void verify_a_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("a"));
    }

    @Test
    public void verify_i_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("i"));
    }

    @Test
    public void verify_U_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("U"));
    }

    @Test
    public void verify_E_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("E"));
    }

    @Test
    public void verify_O_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("O"));
    }

    @Test
    public void verify_A_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("A"));
    }

    @Test
    public void verify_I_is_vowel() {
        Assert.assertTrue(Exercise.isVowels("I"));
    }

    @Test
    public void verify_b_is_vowel() {
        Assert.assertFalse(Exercise.isVowels("b"));
    }

    @Test
    public void verify_B_is_vowel() {
        Assert.assertFalse(Exercise.isVowels("B"));
    }

    @Test
    public void verify_exception() {
        try {
            Exercise.isVowels("");
        } catch (IllegalArgumentException e){
            Assert.assertTrue(e.getMessage().equals("INPUT STRING LENGTH MUST BE EQUALS 1"));
            // Assert.assertEquals(e.getMessage(), "INPUT STRING LENGTH MUST BE EQUALS 1");
        }
    }
}
