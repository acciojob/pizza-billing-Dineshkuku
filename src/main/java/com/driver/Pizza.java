package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheese = false;
    private boolean extraTopping = false;
    private boolean takeaway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            setPrice(300);
        }
        else{
            setPrice(400);
        }     
    }

    public void setPrice(int price) {
        this.price = this.price + price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        //we have set our boolean values to false... so condition goes like this
        // if cheese!=false that is, cheese = true then, add cheese
        if(!extraCheese){
            this.extraCheese = true;
            int cheesePrice = 80;
            setPrice(cheesePrice);
        }
    }

    public void addExtraToppings(){
        if(!extraTopping){
            this.extraTopping = true;
            int vegPrice = 70;
            int nonVeg = 120;
            if(this.isVeg){
                setPrice(vegPrice);
            }
            else{
                setPrice(nonVeg);
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway){
            this.takeaway = true;
            int price = 20;
            setPrice(price);
        }
    }

    public String getBill(){
        String Bill = "";
        if(isVeg){
            Bill = Bill + "Base Price of veg pizza is " + 300 + "\n";
        }
        else{
            Bill = Bill + "Base Price of non-veg pizza is " + 400 + "\n";
        }
        if(extraCheese){
            Bill = Bill + "Extra cheese added " + 80 + "\n";
        }

        if(extraTopping){
            if(this.isVeg){
                Bill = Bill + "Extra toppings added " + 70 + "\n";
            }
            else{
                Bill = Bill + "Extra toppings added " + 120 + "\n";
            }
        }

        if(takeaway){
            Bill = Bill + "Baggage added " + 20 + "\n";
        }

        Bill = Bill + "Total Price: " + this.price + "\n";
        this.bill = Bill;
        
        return this.bill;
    }
}
