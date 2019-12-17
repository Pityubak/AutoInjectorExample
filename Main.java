/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pityubak.autoinjectorexample;

import com.pityubak.autoinjector.Context;

/**
 *
 * @author Pityubak
 */
public class Main {

    public static void main(String[] args) {

        Context context = new Context(Main.class);
        context.init();
        ConcreteClass cls = (ConcreteClass) context.inject(ConcreteClass.class);
        Test test = new Test(cls);
        test.seeMagic();
    }

}
