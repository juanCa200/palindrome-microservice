package com.pruebaTecnica.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PalindromeResponse {
    private int lengthCadena;
    private int isPalindromo;
    private int lengthCaracteresEspeciales;
}
