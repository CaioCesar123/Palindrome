package com.example.palindrome;

public class Palindrome {

    public boolean Verificar(String nome){
        char[] Nome = nome.toCharArray();

        int Fim = Nome.length - 1;

        for (int i=0;i < Fim;i++){
            for (int j=Fim;j > 0;j--){
                if (Nome[i] != Nome[j]){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
