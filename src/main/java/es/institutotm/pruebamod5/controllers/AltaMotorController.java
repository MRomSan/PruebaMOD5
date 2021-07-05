/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.institutotm.pruebamod5.controllers;

import es.institutotm.pruebamod5.models.Conexion;
import es.institutotm.pruebamod5.models.Motor;
import es.institutotm.pruebamod5.models.ValidaMotor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Manuel
 */
@Controller
public class AltaMotorController {
    private ValidaMotor validar;
    private JdbcTemplate jdbc;
    
    public AltaMotorController() {
        this.jdbc = new JdbcTemplate(new Conexion().conectar());
        this.validar = new ValidaMotor();
    }
    
    @RequestMapping(value = "altaMotor.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        Motor m = new Motor();
        ModelAndView mav = new ModelAndView();
        mav.addObject("m", m);
        mav.setViewName("formAltaMotor");
        return mav;
    }
    
    @RequestMapping(value = "altaMotor.htm", method = RequestMethod.POST)
    public ModelAndView form(@ModelAttribute ("m") Motor m, BindingResult result) {
        this.validar.validate(m, result);
        if(result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.addObject("m", m);
            mav.setViewName("formAltaMotor");
            return mav;
        } else {
            this.jdbc.update("INSERT INTO motores VALUES (?,?,?,?,?)", m.getModelo(), m.getFabricante(), m.getPotencia(), m.getPeso(), m.getCantidad());
            ModelAndView mav = new ModelAndView("redirect:/listadoMotores.htm?confirmacion=1");
            return mav;
        }
    }
}
