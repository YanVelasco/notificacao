package com.yanvelasco.notificacao.controller;

import com.yanvelasco.notificacao.business.EmailService;
import com.yanvelasco.notificacao.business.dto.TarefaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefaDTO tarefaDTO){
        emailService.enviaEmail(tarefaDTO);
        return ResponseEntity.ok().build();
    }
}