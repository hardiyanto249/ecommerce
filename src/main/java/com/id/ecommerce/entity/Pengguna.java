package com.id.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Pengguna implements Serializable{
    @Id
    private String id;
    @JsonIgnore
    private String password;
    private String nama;
    private String alamat;
    private String email;
    private String hp;
    private String roles;
    private boolean isAktif;

    public void setIsAktif(boolean isAktif) {
		this.isAktif = isAktif;
	}

    public Pengguna(String username) {
        this.id=username;
    }

    public Pengguna() {
    }


}
