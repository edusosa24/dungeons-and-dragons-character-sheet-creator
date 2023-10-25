package com.esosa.dungeonsanddragonscharactersheet.service;

import com.esosa.dungeonsanddragonscharactersheet.dao.AppDAO;
import com.esosa.dungeonsanddragonscharactersheet.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    private AppDAO appDAO;

    @Autowired
    public UserServiceImpl(AppDAO appDAO) {
        this.appDAO = appDAO;
    }

    @Override
    @Transactional
    public void createUser(User newUser) {
        appDAO.createUser(newUser);
    }

    @Override
    public User getUser(long userId) {
        User tempUser = appDAO.getUser(userId);
        return tempUser;
    }

    @Override
    @Transactional
    public void deleteUser(long userId) {
        appDAO.deleteUser(userId);
    }
}
