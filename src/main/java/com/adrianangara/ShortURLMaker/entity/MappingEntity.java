package com.adrianangara.ShortURLMaker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="MappingEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MappingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String shortURL;
    private String longURL;
}
