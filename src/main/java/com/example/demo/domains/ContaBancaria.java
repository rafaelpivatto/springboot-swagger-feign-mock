package com.example.demo.domains;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContaBancaria {

    private String banco;
    private String filial;
    private String numeroConta;
    private String digitoVerificador;
    private String tipoConta;
    private String interoperabilidade;
    private String status;
    private Double saldoAtual;
    private String idPrograma;
    private String idConta;
    private LocalDateTime dataCriacao;
    private LocalDateTime ultimaAtualizacao;

}
