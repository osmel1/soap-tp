package org.example;

import proxy.BankService;
import proxy.BanqueWS;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankService proxy = new BanqueWS().getBankServicePort();
        System.out.println(proxy.conversionEuroToDh(800));
    }
}