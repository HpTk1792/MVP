package com.theopensourcefamily.mvp.Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *  Class AccessData manage the different methods to guard or load data
 */

public class AccessData {

    private File UsersFile = new File("Users.bin");

    /**
     * Method for save user into file of users
     *
     * @param user Object User
     */
    public void SaveUser(User user){
        try {
            ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream(UsersFile));
            oos.writeObject(user);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
