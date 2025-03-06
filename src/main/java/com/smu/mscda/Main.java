package com.smu.mscda;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String input = scanner.nextLine();

        // Capitalize the input string
        String capitalized = StringUtils.capitalize(input);

        // Generate MD5 hash
        String md5Hex = DigestUtils.md5Hex(input);

        System.out.println("Capitalized String: " + capitalized);
        System.out.println("MD5 Hash: " + md5Hex);

        scanner.close();
    }
}
