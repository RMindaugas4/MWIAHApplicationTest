import Common.DTO;
import FirstTestData.UserManager;



public class FirstTestAssigment {

    public static UserManager manager;

    public static void main(String[] args) {

        manager = new UserManager();
        manager.createUsers(DTO.desiredUserNumber);
        manager.printAllUsersToConsole();
        manager.printAllUsersToFile(DTO.pathToUserFile);

    }
}

