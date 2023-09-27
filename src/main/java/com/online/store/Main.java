package com.online.store;

import com.online.store.menu.Menu;
import com.online.store.menu.implementation.MainMenu;

public class Main {
    public static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        Menu mainMenu = new MainMenu();
        mainMenu.start();
    }
}
