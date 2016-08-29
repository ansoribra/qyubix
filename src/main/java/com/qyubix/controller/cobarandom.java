package com.qyubix.controller;

import java.util.Random;

/**
 * Created by User2 on 8/26/2016.
 */
 public class cobarandom {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            System.out.println(random.nextInt(10)+1);
        }
    }
}

