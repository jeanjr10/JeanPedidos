/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.JeanPedido.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.JeanPedidos.modelo.Produto;

/**
 *
 * @author JeanJunior
 */
@Named(value = "cadastrarProdutoBean")
@RequestScoped
public class CadastraProdutoBean {

    Produto produto = new Produto();

    public Produto getProduto() {
        return produto;
    }

    public void adicionar() {
        // produtoDAO.salvar(produto);
        System.out.println(produto);
    }
}
