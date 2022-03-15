package com.duranco.exercice1;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Commande {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String produit;
@Min(1)
private int quantite;
@Temporal(TemporalType.TIMESTAMP)
@CreatedDate
private Date datecmd;
@Column(columnDefinition = "varchar(30) default 'attente'")
private String etat;

@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, optional = false)
@JoinColumn(name = "user_id" , nullable = false)
private User user;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getProduit() {
	return produit;
}

public void setProduit(String produit) {
	this.produit = produit;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public Date getDatecmd() {
	return datecmd;
}

public void setDatecmd(Date datecmd) {
	this.datecmd = datecmd;
}

public String getEtat() {
	return etat;
}

public void setEtat(String etat) {
	this.etat = etat;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}





}
