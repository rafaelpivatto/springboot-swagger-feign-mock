package com.example.demo.domains;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountHolders {

    private String nome;
    private String numeroDocumento;
    private String tipoPessoa;
    private String codigoPaisTelefone;
    private String codigoAreaTelefone;
    private String numeroTelefone;
    private String idExterno;
    private ContaBancaria contaBancaria;
}
