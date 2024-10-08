package com.enalto;

import com.enalto.model.Cpf;

public class Main {
    public static void main(String[] args) {

        Cpf cpf = new Cpf("600.621.sadgdsfagdgfsg691-49");
        System.out.println(cpf.getOnlyNumbers());

        Cpf cpf1 = new Cpf("87409217293");
        System.out.println(cpf1.getOnlyNumbers());

        Cpf cpf2 = new Cpf("874092172-93");
        System.out.println(cpf2.getOnlyNumbers());

        Cpf cpf3 = new Cpf("874.092.172-93");
        System.out.println(cpf3.getOnlyNumbers());

        System.out.println(Cpf.removeNonDigits("874.092.172-93"));

    }


}