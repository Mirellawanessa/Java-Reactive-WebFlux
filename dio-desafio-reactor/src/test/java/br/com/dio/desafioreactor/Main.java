package br.com.dio.desafioreactor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var question1 = new Question1();
        question1.inc(List.of(1L,2L, 3L))
                .subscribe();
    }
}
