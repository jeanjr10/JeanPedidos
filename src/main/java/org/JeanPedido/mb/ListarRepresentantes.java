/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.JeanPedido.mb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.JeanPedidos.DAO.RepresentanteDAO;
import org.JeanPedidos.modelo.Representante;

/**
 *
 * @author JeanJunior
 */
@Named(value = "ListarRepresentantes")
@RequestScoped
public class ListarRepresentantes {
    @Inject
    private RepresentanteDAO dao;
    private List<Representante> representante;

    @PostConstruct
    private void init(){
        this.representante = dao.buscarTodos();
    }
    
    public List<Representante> getRepresentante() {
        return representante;
    }
    
}
