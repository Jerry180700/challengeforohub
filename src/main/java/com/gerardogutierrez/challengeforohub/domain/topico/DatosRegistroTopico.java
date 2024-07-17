package com.gerardogutierrez.challengeforohub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank(message = "Digite un título")
        String titulo,
        @NotBlank(message = "Digite un mensaje")
        String mensaje,
        @NotBlank(message = "Digite un autor")
        String autor,
        @NotNull(message = "Digite un curso")
        Curso curso
)
{ }
