package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraToppings;

    boolean isExtraCheese;
    boolean isExtraToppings;
    boolean isTakeway;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isExtraCheese=false;
        this.isExtraToppings=false;
        this.isTakeway=false;
        this.isBillGenerated=false;
        this.isVeg = isVeg;
        this.bill="";

        if(isVeg) {
            this.price = 300;
            this.extraToppings = 70;
        }
        else {
            this.price=400;
            this.extraToppings = 120;
        }

        this.extraCheese=80;
        this.bill+="Base Price Of the Pizza: "+this.price+"\n";
    }



    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
     if(!isExtraCheese)
     {
       this.price=price+extraCheese;
       isExtraCheese=true;
     }


    }

    public void addExtraToppings(){
        // your code goes here

        if(!isExtraToppings)
        {
            this.price+=extraToppings;
            isExtraToppings=true;
        }

    }

    public void addTakeaway(){
        if(!isTakeway)
        {
            this.price+=20;
            isTakeway=true;
        }

    }

    public String getBill() {
        // your code goes here
        if (!isBillGenerated) {
            if (isExtraCheese)
                this.bill += "Extra Cheese Added: " + this.extraCheese + "\n";
            if (isExtraToppings)
                this.bill += "Extra Toppings Added: " + this.extraToppings + "\n";
            if (isTakeway)
                this.bill += "Paper bag Added: " + "20" + "\n";

            this.bill += "Total: " + this.price+"\n";
        }
            return this.bill;

    }
}
