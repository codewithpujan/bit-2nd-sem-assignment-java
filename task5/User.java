
abstract class User {
    abstract void displayRole();
}

class Customer extends User {
    void displayRole() {
        System.out.println("Role: Customer");
    }
}

class DeliveryPerson extends User {
    void displayRole() {
        System.out.println("Role: Delivery Person");
    }
}

class Admin extends User {
    void displayRole() {
        System.out.println("Role: Admin");
    }
}

class UserFactory {
    public static User createUser(String roleType) {
        switch (roleType.toLowerCase()) {
            case "customer":
                return new Customer();
            case "deliveryperson":
                return new DeliveryPerson();
            case "admin":
                return new Admin();
            default:
                throw new IllegalArgumentException("Invalid user role");
        }
    }
}
