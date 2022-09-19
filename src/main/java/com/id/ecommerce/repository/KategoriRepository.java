package com.id.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.id.ecommerce.entity.Kategori;

public interface KategoriRepository extends JpaRepository<Kategori,String>{
    
}
