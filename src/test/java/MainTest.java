package com.smu.mscda;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;

public class MainTest {

    @Test
    void testCapitalize() {
        String input = "hello";
        String expected = "Hello";
        assertEquals(expected, StringUtils.capitalize(input));
    }

    @Test
    void testMD5Hash() {
        String input = "hello";
        String expectedHash = "5d41402abc4b2a76b9719d911017c592"; // Precomputed MD5 hash of "hello"
        assertEquals(expectedHash, DigestUtils.md5Hex(input));
    }
}
