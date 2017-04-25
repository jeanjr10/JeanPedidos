/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.JeanPedido.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.JeanPedidos.DAO.RepresentanteDAO;
import org.JeanPedidos.modelo.Representante;

/**
 *
 * @author JeanJunior
 */
@Named(value = "cadastrarRepresentantesBean")
@RequestScoped
public class CadastrarRepresentantesBean {
    Representante representante = new Representante();
    @Inject
    RepresentanteDAO representanteDAO;
    
    public void adicionar() {
            representanteDAO.salvar(representante);
        }
        //System.out.println(produto);

    public Representante getRepresentante() {
        return representante;
    }
}
