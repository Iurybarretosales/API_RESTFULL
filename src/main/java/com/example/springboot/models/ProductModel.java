package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;
import java.util.UUID;

@Entity//Declarar que ProductModel é uma entidade
@Table(name = "TB_PRODUCTS")//Criar tabela com nome TB_PRODUCTS
@Data // criar gets e sets usando lombok
public class ProductModel extends RepresentationModel<ProductModel>  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;
}