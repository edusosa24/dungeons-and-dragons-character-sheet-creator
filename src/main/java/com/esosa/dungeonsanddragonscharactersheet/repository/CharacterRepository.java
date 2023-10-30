package com.esosa.dungeonsanddragonscharactersheet.repository;

import com.esosa.dungeonsanddragonscharactersheet.entity.character.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    @Query(value = "FROM Character WHERE user.id = :userId")
    List<Character> getCharactersFromUser(Long userId);
}
