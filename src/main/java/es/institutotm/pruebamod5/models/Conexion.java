/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.institutotm.pruebamod5.models;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Manuel
 */
public class Conexion {
    
    public DriverManagerDataSource conectar() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost/motorland");
        ds.setUsername("root");
        ds.setPassword("");
        return ds;
    }
    
}
