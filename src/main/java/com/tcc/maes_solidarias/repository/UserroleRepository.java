package com.tcc.maes_solidarias.repository;

import com.tcc.maes_solidarias.entity.User;
import com.tcc.maes_solidarias.entity.Userrole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("userroleRepository")
public interface UserroleRepository extends CrudRepository<User,Integer> {
	Userrole findByName(String rolename);
}
