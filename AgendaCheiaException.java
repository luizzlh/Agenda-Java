package com.loiane.cursojava.exercises.aula47_52;

public class AgendaCheiaException extends Exception{
    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}