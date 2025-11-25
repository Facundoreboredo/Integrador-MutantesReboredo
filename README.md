# Mutant Detector API

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Coverage](https://img.shields.io/badge/Coverage-90%25-green.svg)]()

API REST que detecta si un humano es mutante basándose en su secuencia de ADN.

## Descripción del Proyecto

**Criterio:** Se considera mutante si se encuentran **más de una** secuencia de cuatro letras iguales.

## Tecnologías Utilizadas

* **Java 17**
* **Spring Boot 3.2.0**
* **H2 Database** (Base de datos en memoria para persistencia)
* **Lombok** (Para reducción de código boilerplate)
* **JUnit 5 & Mockito** (Testing)
* **JaCoCo** (Reporte de cobertura de código > 80%)
* **Swagger / OpenAPI** (Documentación de API)

---

## Instrucciones de Ejecución (Local)

Sigue estos pasos para correr el proyecto en tu máquina:

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/Facundoreboredo/Integrador-MutantesReboredo/tree/main](https://github.com/Facundoreboredo/Integrador-MutantesReboredo/tree/main)
    cd mutantes
    ```

2.  **Compilar y Ejecutar:**
    * **En Windows:**
        ```powershell
        .\gradlew.bat bootRun
        ```
    * **En Mac/Linux:**
        ```bash
        ./gradlew bootRun
        ```

3.  **Verificar que está corriendo:**
    La aplicación iniciará en el puerto **8080**.

---

##  Documentación y Pruebas

Una vez iniciada la aplicación, puedes acceder a las siguientes herramientas:

* **Swagger UI (Documentación interactiva):**
     [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
    *Desde aquí puedes probar los endpoints `/mutant` y `/stats` directamente.*

* **Consola H2 (Base de Datos):**
     [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
    * **JDBC URL:** `jdbc:h2:mem:testdb`
    * **User Name:** `sa`
    * **Password:** *(dejar vacío)*

---

## Endpoints de la API

### 1. Detectar Mutante
Envia una secuencia de ADN para ser analizada.

* **URL:** `/mutant`
* **Método:** `POST`
* **Respuestas:**
    * `200 OK`: Es Mutante.
    * `403 Forbidden`: Es Humano.
    * `400 Bad Request`: ADN inválido (caracteres erróneos, matriz no cuadrada, null).

**Ejemplo de Request (Mutante):**
```json
{
    "dna": [
        "ATGCGA",
        "CAGTGC",
        "TTATGT",
        "AGAAGG",
        "CCCCTA",
        "TCACTG"
    ]
}
