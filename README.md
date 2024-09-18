# Microservicio de Palíndromos

Este proyecto es un microservicio en Spring Boot que recibe una cadena y devuelve información sobre si es un palíndromo, su longitud, y la cantidad de caracteres especiales.

## Requisitos
- Java 11
- Maven

## Instrucciones para ejecutar
1. Clona el repositorio. 
2. Navega al directorio del proyecto.
3. Ejecuta (mvn spring-boot:run).
4. Usa Postman o URL para hacer una solicitud POST al endpoint `/api/palindrome/check` con el siguiente JSON de ejemplo:
   {
     "palindromo":"anita lava la tina"
   }
