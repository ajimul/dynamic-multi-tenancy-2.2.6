package com.accounting.rest.multitenant.tenant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accounting.rest.multitenant.tenant.entity.User;

/**
 * @author Md. Amran Hossain
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

}
