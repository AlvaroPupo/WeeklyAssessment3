package com.company.Question_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */
        List<String> cookingIngredients = new ArrayList<String>();
        cookingIngredients.add("potato");
        cookingIngredients.add("chicken wings");
        cookingIngredients.add("tomato sauce");
        cookingIngredients.add("bread");
        cookingIngredients.add("mushrooms");
        cookingIngredients.add("water");

        Scanner one = new Scanner(System.in);
        System.out.println("Hello welcome to your kitchen!! \n" +
                "(Press 'a' to watch what you have on your fridge)");
        one.nextLine();

        for(String DisplayArray : cookingIngredients) {
            if (DisplayArray.contains("a") || DisplayArray.contains("o")) {
                System.out.println(DisplayArray);

            }
        }
    }
}
