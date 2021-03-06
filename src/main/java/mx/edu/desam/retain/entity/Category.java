/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.desam.retain.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alphonso
 */
@Entity
@Table(name = "category", schema = "playit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
    , @NamedQuery(name = "Category.findByIdCategory", query = "SELECT c FROM Category c WHERE c.idCategory = :idCategory")
    , @NamedQuery(name = "Category.findByIdOriginCategory", query = "SELECT c FROM Category c WHERE c.idOriginCategory = :idOriginCategory")
    , @NamedQuery(name = "Category.findByDescription", query = "SELECT c FROM Category c WHERE c.description = :description")
    , @NamedQuery(name = "Category.findByActivo", query = "SELECT c FROM Category c WHERE c.activo = :activo")
    , @NamedQuery(name = "Category.findByDateLastUse", query = "SELECT c FROM Category c WHERE c.dateLastUse = :dateLastUse")
    , @NamedQuery(name = "Category.findByIdUser", query = "SELECT c FROM Category c order by c.idCategory, c.idOriginCategory")})
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_category")
    private Integer idCategory;
    @Column(name = "id_origin_category")
    private Integer idOriginCategory;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private boolean activo;
    @Column(name = "date_last_use")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastUse;
    @JoinColumn(name = "id_answer", referencedColumnName = "id_answer")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Answer idAnswer;
    @JoinColumn(name = "id_user", referencedColumnName = "id_userp")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UserPlay idUser;

    public Category() {
    }

    public Category(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Category(Integer idCategory, String description, boolean activo) {
        this.idCategory = idCategory;
        this.description = description;
        this.activo = activo;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Integer getIdOriginCategory() {
        return idOriginCategory;
    }

    public void setIdOriginCategory(Integer idOriginCategory) {
        this.idOriginCategory = idOriginCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getDateLastUse() {
        return dateLastUse;
    }

    public void setDateLastUse(Date dateLastUse) {
        this.dateLastUse = dateLastUse;
    }

    public Answer getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(Answer idAnswer) {
        this.idAnswer = idAnswer;
    }

    public UserPlay getIdUser() {
        return idUser;
    }

    public void setIdUser(UserPlay idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategory != null ? idCategory.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.idCategory == null && other.idCategory != null) || (this.idCategory != null && !this.idCategory.equals(other.idCategory))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.desam.toapply.Category[ idCategory=" + idCategory + " ]";
    }
    
}
