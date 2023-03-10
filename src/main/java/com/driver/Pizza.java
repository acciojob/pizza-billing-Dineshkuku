// package com.driver;

// public class Pizza {

//     private int price;
//     private Boolean isVeg;
//     private String bill;

//     private int extraCheese;
//     private int extraTopping;
//     private int takeaway;

//     boolean isCheeseAdded;
//     boolean isToppingsAdded;
//     boolean isTakeawayAdded;
//     boolean isBillGenerated;

//     public Pizza(Boolean isVeg){
//         this.isVeg = isVeg;
//         this.extraCheese = 80;
//         this.takeaway = 20;

//         if(isVeg==true){
//             this.price = 300;
//             this.extraTopping = 70;
//         }
//         else{
//             this.price = 400;
//             this.extraTopping = 120;
//         }

//         this.isCheeseAdded = false;
//         this.isToppingsAdded = false;
//         this.isTakeawayAdded = false;
//         this.bill = "Base price of the Pizza: " + this.price + "\n";
//     }

//     public int getPrice(){
//         return this.price;
//     }

//     public void addExtraCheese(){
//         if(isCheeseAdded == false){
//             this.price = this.extraCheese + this.price;
//             isCheeseAdded = true;
//         }
//     }

//     public void addExtraToppings(){
//         if(!isToppingsAdded){
//             this.price = this.price + this.extraTopping;
//             isToppingsAdded = true;
//         }
//     }

//     public void addTakeaway(){
//         if(!isTakeawayAdded){
//             this.price = this.price + this.takeaway;
//             isTakeawayAdded = true;
//         }
//     }

//     public String getBill(){
        
//         if(isBillGenerated == false){
            
//             if(isCheeseAdded==true){
//                 this.bill += "Extra Cheese Added: " + this.extraCheese +"\n";
//             }
//             if(isToppingsAdded==true){
//                 this.bill += "Extra Toppings Added: " + this.extraTopping + "\n";
//             }
//             if(isTakeawayAdded==true){
//                 this.bill += "Paperbag Added: " + this.takeaway + "\n";
//             }
//             this.bill += "Total Price: " + this.price + "\n";
//             isBillGenerated = true;
//         }
//         return this.bill;
//     }
// }


package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int takeAwayPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheesePrice=80;
        this.takeAwayPrice=20;

        if(isVeg==true) {
            // your code goes here
            this.price = 300;
            this.extraToppingsPrice=70;
        }else {
            this.price = 400;
            this.extraToppingsPrice=120;
        }


        this.isCheeseAdded=false;
        this.isToppingsAdded=false;
        this.isTakeAwayAdded=false;

        this.bill= "Base Price Of The Pizza: " + this.price+ "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price= this.price+this.extraCheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price+=this.extraToppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price+=this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){

            if(isCheeseAdded==true){
                this.bill += "Extra Cheese Added: "+ this.extraCheesePrice+"\n";
            }
            if(isToppingsAdded==true){
                this.bill += "Extra Toppings Added: "+ this.extraToppingsPrice+"\n";
            }
            if(isTakeAwayAdded==true){
                this.bill += "Paperbag Added: "+ this.takeAwayPrice+"\n";
            }
            this.bill+= "Total Price: "+ this.price+"\n";

            isBillGenerated=true;
        }
        return this.bill;
    }
}