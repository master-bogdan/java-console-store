package com.online.store.menu.implementation;

import com.online.store.config.ApplicationContext;
import com.online.store.menu.Menu;

import java.util.Scanner;

public class ChangeEmailMenu implements Menu {
    private ApplicationContext context;

    {
        context = ApplicationContext.getInstance();
    }


    @Override
    public void start() {
        printMenuHeader();
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        context.getLoggedInUser().setEmail(userInput);
        System.out.println("Your email has been successfully changed");
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CHANGE EMAIL *****");
        System.out.println("Enter new email: ");
    }
}
