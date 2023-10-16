package com.esosa.dungeonsanddragonscharactersheet;

import com.esosa.dungeonsanddragonscharactersheet.dao.AppDAO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DungeonsAndDragonsCharacterSheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(DungeonsAndDragonsCharacterSheetApplication.class, args);
	}



	/*                       */
	/*  DAO METHODS TESTING  */
	/*                       */

	/*
	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
			// USER
			// createUser(appDAO);
			// getUser(appDAO);
			// deleteUser(appDAO);


			// CHARACTER
		};
	}
	*/
	private void deleteUser(AppDAO appDAO) {
		try {
			long userId = 4;
			appDAO.deleteUser(userId);
			System.out.println("User -> " + userId + " -> successfully deleted.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void getUser(AppDAO appDAO) {
		try {
			long userId = 2;
			User tempUser = appDAO.getUser(userId);
			if(tempUser == null) {
				throw new RuntimeException("User " + userId + " was not found.");
			}
			System.out.println("User -> " + tempUser + " -> successfully found.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void createUser(AppDAO appDAO) {
		try {
			User tempUser = new User("billar", "pooleada");
			appDAO.createUser(tempUser);
			System.out.println("User -> " + tempUser + " -> successfully created.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
