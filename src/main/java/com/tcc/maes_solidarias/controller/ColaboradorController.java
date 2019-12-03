package com.tcc.maes_solidarias.controller;

import com.tcc.maes_solidarias.entity.Colaborador;
import com.tcc.maes_solidarias.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class ColaboradorController {

    @Autowired
    ColaboradorRepository colaboradorRepository;

    @RequestMapping("/adicionar")
    public String visualizarAdicionar(Model model) {
        model.addAttribute("colaborador", new Colaborador());
        return "formColetor";
    }


    @RequestMapping("/novoColaborador")
    public String adicionarContato(Model model) {
        model.addAttribute("colaborador", new Colaborador());
        return "formColetor";
    }

    @PostMapping("/salvarColaborador")
    public String salvarColaborador(@Valid Colaborador colaborador, BindingResult result, RedirectAttributes atributes) {

        System.out.println(result.getAllErrors());
        if (result.hasErrors()) {
            return "formColetor";
        }
        atributes.addFlashAttribute("mensagem", String.format("Usuario %s Cadastrado com Sucesso.", colaborador.getNome()));
        colaboradorRepository.save(colaborador);
        return "redirect:/adicionar/";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        colaboradorRepository.deleteById(id);
        return "redirect:/listarContato";
    }

    @RequestMapping("/listarContato")
    public ModelAndView listarContato() {
        ModelAndView mv = new ModelAndView("listar");
        mv.addObject("colaboradores", colaboradorRepository.findAll());
        return mv;
    }
}

