package com.sda.facade;

public class Product {

    public void getAll(){
        System.out.println("Zwracam wszystkie prodkty");
    }

    public void getByCategory(String category){
        System.out.println("Produkt z kategorii " + category);
    }

}
