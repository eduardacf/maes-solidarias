package com.tcc.maes_solidarias.repository;


import com.tcc.maes_solidarias.entity.User;
import com.tcc.maes_solidarias.entity.Userrole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByusername(String username);
}