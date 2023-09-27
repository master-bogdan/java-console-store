package com.online.store.services;

import com.online.store.entetie.User;

public interface UserManagementService {
    String registerUser(User user);

    User[] getUsers();

    User getUserByEmail(String userEmail);
}
