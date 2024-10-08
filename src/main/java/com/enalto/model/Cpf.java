package com.enalto.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cpf {
    private String cpf;

    public Cpf(String cpf) {
        Objects.requireNonNull(cpf.trim());
        checkLenght(cpf);
        this.cpf = cpf;
    }

    public String getOnlyNumbers() {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(cpf);
        cpf = matcher.replaceAll("");
        checkLenght(cpf);

        return cpf;
    }

    private boolean checkLenght(String cpf) {
        if (cpf.length() < 11)
            throw new RuntimeException("Cpf precisa ter pelo menos 11 digitos");
        return true;
    }

    public static String removeNonDigits(String str) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(str);
        str = matcher.replaceAll("");

        return str;
    }

}
