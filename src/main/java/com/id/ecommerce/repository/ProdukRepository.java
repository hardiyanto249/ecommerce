package com.id.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.id.ecommerce.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk,String>{
    
}
