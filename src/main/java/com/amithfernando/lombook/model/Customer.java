/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amithfernando.lombook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author Amith
 */
public @Data  @AllArgsConstructor @NoArgsConstructor   class Customer {

    private  String firstName;
    private String lastName;
    private int age;
    
    
}
