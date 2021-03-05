package com.example.demo;

public class Agency implements Rent{
    private Landlord myLandlord;

    public Agency (){
        this.myLandlord = new Landlord();
    }

    @Override
    public void rent() {
        myLandlord.rent();
    }

    public void agencyCost(){
        System.out.println("收中介费");
    }

    public void showAround(){
        System.out.println("房屋带看");
    }
}
