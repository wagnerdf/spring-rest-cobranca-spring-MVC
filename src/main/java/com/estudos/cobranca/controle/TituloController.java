package com.estudos.cobranca.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.estudos.cobranca.model.Titulo;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Titulo titulo) {
		//Salvar no banco de dados
		System.out.println(">>>> "+titulo.getDescricao());
		
		return "CadastroTitulo";
	}
	
}
 