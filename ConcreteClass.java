/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.autoinjectorexample;

import com.pityubak.autoinjector.annotation.AutoInject;
import com.pityubak.autoinjectorexample.repo.PureMagic;
import com.pityubak.autoinjectorexample.repo.SomeMagic;

/**
 *
 * @author Pityubak
 */
public  class ConcreteClass {
    
    @AutoInject
    private SomeMagic magic;
    
    @AutoInject
    private PureMagic pureMagic;

    
    
    public final void call(){
        magic.send("Hhaa");
        pureMagic.get();
    }
}
