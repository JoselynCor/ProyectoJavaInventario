/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.pojos;

/**
 *
 * @author ivan
 */
public class Categorias {
    
    private int id_categoria_prod;
    private String nom_categoria_prod;
    private String desc_categoria_prod;

    public Categorias(int id_categoria_prod, String nom_categoria_prod, String desc_categoria_prod) {
        this.id_categoria_prod = id_categoria_prod;
        this.nom_categoria_prod = nom_categoria_prod;
        this.desc_categoria_prod = desc_categoria_prod;
    }

    public String getDesc_categoria_prod() {
        return desc_categoria_prod;
    }

    public void setDesc_categoria_prod(String desc_categoria_prod) {
        this.desc_categoria_prod = desc_categoria_prod;
    }

    public int getId_categoria_prod() {
        return id_categoria_prod;
    }

    public void setId_categoria_prod(int id_categoria_prod) {
        this.id_categoria_prod = id_categoria_prod;
    }

    public String getNom_categoria_prod() {
        return nom_categoria_prod;
    }

    public void setNom_categoria_prod(String nom_categoria_prod) {
        this.nom_categoria_prod = nom_categoria_prod;
    }
    
    
    
}
