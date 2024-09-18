package com.pruebaTecnica.demo.service;

import com.pruebaTecnica.demo.model.PalindromeResponse;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
    public PalindromeResponse processPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        boolean isPalindrome = cleanedInput.equals(reversedInput);

        int lengthCadena = input.length();
        int lengthCaracteresEspeciales = input.length() - cleanedInput.length();
        int isPalindromo = isPalindrome ? 1 : 0;

        return new PalindromeResponse(lengthCadena, isPalindromo, lengthCaracteresEspeciales);
    }
}
