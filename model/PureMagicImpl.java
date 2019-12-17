/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.autoinjectorexample.model;

import com.pityubak.autoinjector.annotation.Service;
import com.pityubak.autoinjectorexample.repo.PureMagic;

/**
 *
 * @author Pityubak
 */
@Service
public class PureMagicImpl implements PureMagic{

    @Override
    public void get() {
        System.out.println("Hey");
    }
    
}
