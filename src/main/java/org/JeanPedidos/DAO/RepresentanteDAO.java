/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.JeanPedidos.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.JeanPedidos.modelo.Representante;

/**
 *
 * @author JeanJunior
 */
public class RepresentanteDAO {
    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public void salvar(Representante representante){
        em.persist(representante);
    }
     public List<Representante> buscarTodos(){
        TypedQuery<Representante> query = em.
                createQuery("select c from Representante c", Representante.class);
        return query.getResultList();
    }
}
