package com.tcc.maes_solidarias.service;

import com.tcc.maes_solidarias.entity.User;

public interface UserService {
    User findByusername(String username);
    void save(User user);
}