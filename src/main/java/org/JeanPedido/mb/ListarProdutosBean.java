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
import org.JeanPedidos.DAO.ProdutoDAO;
import org.JeanPedidos.modelo.Produto;

/**
 *
 * @author JeanJunior
 */
    @Named(value = "ListarProdutos")
@RequestScoped
public class ListarProdutosBean {
    @Inject
    private ProdutoDAO dao;
    private List<Produto> produtos;

    @PostConstruct
    private void init(){
        this.produtos = dao.buscarTodos();
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
}

