package FirstTestData;

import Common.DTO;
import Common.Utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private int increment = 1;

    private List<User> userList = new ArrayList();

    private PrintWriter writer;

    public void createUsers(int userCount) {

        for (int i = 1; i < DTO.desiredUserNumber + this.increment; i++) {
            this.userList.add(new User
                    (i, "TestUser" + Integer.toString(i),
                            Utils.randomStringGenerator(DTO.maxRandomStringLength),
                            Utils.randomStringGenerator(DTO.maxRandomStringLength),
                            Utils.randomStringGenerator(DTO.maxRandomStringLength)));

        }
    }

    public void printAllUsersToConsole() {
        for (User currentUser : this.userList) {
            System.out.println(currentUser.getUserID() + DTO.userSeparator
                    + currentUser.getUserName() + DTO.userSeparator
                    + currentUser.getPassword() + DTO.userSeparator
                    + currentUser.getFirstName() + DTO.userSeparator
                    + currentUser.getLastName()
            );
        }
    }

    public void printAllUsersToFile(String pathToFile) {

        try {
            this.writer = new PrintWriter(pathToFile, "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }

        for (User currentUser : this.userList){
            writer.println(currentUser.getUserID() + DTO.userSeparator
                    + currentUser.getUserName() + DTO.userSeparator
                    + currentUser.getPassword() + DTO.userSeparator
                    + currentUser.getFirstName() + DTO.userSeparator
                    + currentUser.getLastName()
            );
        }
        writer.close();


    }


}
