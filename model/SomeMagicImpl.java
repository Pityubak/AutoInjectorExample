/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.autoinjectorexample.model;

import com.pityubak.autoinjector.annotation.Service;
import com.pityubak.autoinjectorexample.repo.SomeMagic;

/**
 *
 * @author Pityubak
 */
@Service
public class SomeMagicImpl implements SomeMagic {

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
    
}
