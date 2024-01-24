package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		
		Cliente Lucas = new Cliente("Lucas","lucasmvg@hotmail.com","11954859464");
		Cliente Naianne = new Cliente("Naianne", "dranaianne@outook.com","11985276743");
		
		NotificadorEmail notificador = new NotificadorEmail();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(Lucas);
		ativacaoCliente.ativar(Naianne);
	}
}
