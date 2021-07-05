/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.institutotm.pruebamod5.controllers;

import es.institutotm.pruebamod5.models.Conexion;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Manuel
 */
public class ListadoMotorController {
    private JdbcTemplate jdbc;
    
    public ListadoMotorController() {
        Conexion conexion = new Conexion();
        this.jdbc = new JdbcTemplate(conexion.conectar());
    }
    
    @RequestMapping("listadoMotores.htm")
    public ModelAndView listado (HttpServletRequest request) {
        String cartel = request.getParameter("confirmacion");
        ModelAndView mav = new ModelAndView();
        String consulta = "SELECT * FROM motores";
        List motores = this.jdbc.queryForList(consulta);
        
        if(cartel!=null){
            switch (cartel)
            {
                case "1":mav.addObject("cartel", "<p class='alert alert-success mensaje'>Alta de motor realizada con éxito</p>");
                break;
                default:break;
            }
        }
        
        mav.addObject("motores", motores);
        mav.setViewName("listadoMotores");
        return mav;
    }
}
