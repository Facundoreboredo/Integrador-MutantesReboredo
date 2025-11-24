package org.example.mutantes.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mutantes.validation.ValidDna;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DnaRequest {
    @NotNull
    @ValidDna // Validación personalizada
    @Schema(
            description = "Array de Strings que representan la secuencia de ADN (NxN)",
            example = "[\"ATGCGA\",\"CAGTGC\",\"TTATGT\",\"AGAAGG\",\"CCCCTA\",\"TCACTG\"]"
    )
    private String[] dna;
}