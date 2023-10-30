package com.esosa.dungeonsanddragonscharactersheet.repository;

import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
