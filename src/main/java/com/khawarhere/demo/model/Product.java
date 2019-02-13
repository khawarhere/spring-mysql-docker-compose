package com.khawarhere.demo.model;


import lombok.*;

import javax.persistence.*;

/**
 * Created by khawar on 2/13/19.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String productName;
    public String productPrice;
}
