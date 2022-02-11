package com.teamsoft.javaoop;

import com.teamsoft.javaoop.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubbleSort<String> sortObj = new BubbleSort<>();

        System.out.println("[result] " + sortObj.sort(Arrays.asList(args)));
    }
}
