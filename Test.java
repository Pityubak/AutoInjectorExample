/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.autoinjectorexample;

/**
 *
 * @author Pityubak
 */
public class Test {
    
    private  ConcreteClass cls;

    public Test(ConcreteClass cls) {
        this.cls = cls;
        
    }

    //Need empty constructor
    public Test() {
    }
    
    
    
    public void seeMagic(){
        this.cls.call();
    }
}
