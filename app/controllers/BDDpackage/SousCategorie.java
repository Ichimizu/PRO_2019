/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers.BDDpackage;


/*
 *
 * @author spine
 */
public class SousCategorie {

    public String nom;
    public Integer id = null;
    public Categorie categorie;

    SousCategorie(Integer id, String nom, Categorie categorie){
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
    }

    public SousCategorie(String nom, Categorie categorie){
        this(null,nom,categorie);
    }

    SousCategorie(int id, String nom){
        this(id,nom,null);
    }


}
