/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.desam.toapply.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author alphonso
 */
 public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer idCategory;
    private Integer idOriginCategory;
    private String description;
    private boolean activo;
    private Date dateLastUse;
    private AnswerDTO idAnswerDTO;
    private UserPlayDTO idUserDTO;

    public CategoryDTO() {
    }

    public CategoryDTO(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public CategoryDTO(Integer idCategory, String description, boolean activo) {
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

    public AnswerDTO getIdAnswerDTO() {
		return idAnswerDTO;
	}

	public void setIdAnswerDTO(AnswerDTO idAnswerDTO) {
		this.idAnswerDTO = idAnswerDTO;
	}

	public UserPlayDTO getIdUserDTO() {
		return idUserDTO;
	}

	public void setIdUserDTO(UserPlayDTO idUserDTO) {
		this.idUserDTO = idUserDTO;
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
        if (!(object instanceof CategoryDTO)) {
            return false;
        }
        CategoryDTO other = (CategoryDTO) object;
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
