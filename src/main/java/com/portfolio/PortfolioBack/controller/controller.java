package com.portfolio.PortfolioBack.controller;

import com.portfolio.PortfolioBack.model.PosibleEmpleador;
import com.portfolio.PortfolioBack.service.IPosibleEmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
    
    @Autowired
    private IPosibleEmpleadorService posibleEmp;
    
    @GetMapping("/prueba")
    public String prueba(){
        return "Funcionando";
    }
    
    @PostMapping("/")
    public void agregarPersona(@RequestBody PosibleEmpleador posEm){
        posibleEmp.crearPosibleEmpleador(posEm);
    }
    
}
