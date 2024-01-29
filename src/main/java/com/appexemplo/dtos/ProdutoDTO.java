package com.appexemplo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDTO( @NotBlank String nome, @NotNull Float preco) {
    
}
