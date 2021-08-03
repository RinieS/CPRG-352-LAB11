/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.UserDB;
import models.User;

/**
 *
 * @author 840979
 */
public class UserService {
    User getByEmail (String email){
       UserDB ud = new UserDB();
       User user = ud.getUserByEmail(email);
       return user;
    }
    
}
