package com.yanvelasco.notificacao.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yanvelasco.notificacao.business.enums.StatusEnum;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefaDTO {

    private String id;

    private String nomeDaTarefa;

    private String descricao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataCriacao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataEvento;

    private String emailDoUsuario;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataUltimaAtualizacao;

    private StatusEnum status;
}