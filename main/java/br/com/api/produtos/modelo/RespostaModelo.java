// Arquivo responsável por retornar mensagens de erro

package br.com.api.produtos.modelo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component // faz a injeção de dependências (instância o objeto)
@Getter // cria os getter a partir do Lombock
@Setter // cria os setter a partir do Lombock
public class RespostaModelo {

    private String mensagem;
    
}
