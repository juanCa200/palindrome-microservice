package com.pruebaTecnica.demo.controller;


import com.pruebaTecnica.demo.model.PalindromeRequest;
import com.pruebaTecnica.demo.model.PalindromeResponse;
import com.pruebaTecnica.demo.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/palindrome")
public class PalindromeController {

    @Autowired
    private PalindromeService palindromeService;

    @PostMapping("/check")
    public ResponseEntity<PalindromeResponse> checkPalindrome(@RequestBody PalindromeRequest request) {
        return new ResponseEntity<>(palindromeService.processPalindrome(request.getPalindromo()), HttpStatus.OK);
    }

}
