package com.infosecadventures.reversedroid.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidationUtilTest {
    // ... snip ...
    @Test
    public void missing_username() {
        String email = "@test.com";
        assertFalse(ValidationUtil.isValidEmail(email));
    }

    @Test
    public void missing_top_level_domain() {
        String email = "test@test";
        assertFalse(ValidationUtil.isValidEmail(email));
    }

    @Test
    public void valid_email() {
        String email = "test@test.com";
        assertTrue(ValidationUtil.isValidEmail(email));
    }
    // ... snip ...
}