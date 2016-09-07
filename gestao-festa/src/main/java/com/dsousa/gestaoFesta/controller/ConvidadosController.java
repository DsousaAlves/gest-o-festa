package com.dsousa.gestaoFesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dsousa.gestaoFesta.model.Convidado;
import com.dsousa.gestaoFesta.model.Convidados;

@Controller
public class ConvidadosController {
	
	@Autowired
	Convidados convidados;
	
	
	@RequestMapping("/convidados")
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("listaConvidados");
		mv.addObject(new Convidado());
		mv.addObject("convidados", convidados.todos());
		return mv;
	}
	
	@RequestMapping(value = "/convidados", method = RequestMethod.POST)
	public String salvar(Convidado convidado){
		this.convidados.adicionar(convidado);
		
		return "redirect:/convidados";
	
	}
	
	
}
