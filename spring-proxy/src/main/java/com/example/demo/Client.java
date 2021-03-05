package com.example.demo;

public class Client {
    public static void main(String[] args) {
//        Agency myAgency = new Agency();
//
//        myAgency.showAround();
//        myAgency.rent();
//        myAgency.agencyCost();

        Landlord landlord = new Landlord();

        RoomProxy pih = new RoomProxy();
        pih.setTarget(landlord);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
