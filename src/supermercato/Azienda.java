/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercato;

/**
 *
 * @author gael.bouche
 */
public class Azienda {
    private String nome;
    private String sede;
    private Supermercato[] filiari;

    public Azienda(String nome, String sede, Supermercato[] filiari) {
        this.nome = nome;
        this.sede = sede;
        Supermercato [] sup = new Supermercato[filiari.length];
    }
    
    public void addProdotto(){
        
    }
    
    
    
}
