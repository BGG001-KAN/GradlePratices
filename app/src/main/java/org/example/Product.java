package org.example;

public class Product {
   
   private String name;
   private int modle;
   private int price; 
   private String description;

   
public Product(String name, int modle, int price, String description) {
    this.name = name;
    this.modle = modle;
    this.price = price;
    this.description = description;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getModle() {
    return modle;
}
public void setModle(int modle) {
    this.modle = modle;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}

public void displayProductdetails(){
    System.out.println("name is"+" "+getName());
    System.out.println("Description is"+" "+getDescription());
    System.out.println("Modle is"+" "+getModle());
    System.out.println("price is"+" "+getPrice());
}
   
}
