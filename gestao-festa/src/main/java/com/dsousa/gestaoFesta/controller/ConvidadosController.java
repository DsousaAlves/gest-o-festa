package com.dsousa.gestaoFesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dsousa.gestaoFesta.model.Convidados;

@Controller
public class ConvidadosController {
	
	@Autowired
	Convidados convidados;
	
	
	@RequestMapping("/convidados")
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("listaConvidados");
		mv.addObject("convidados", convidados.todos());
		return mv;
	}
}
