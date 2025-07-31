import java.util.*;

interface Observer {
    void update(String status);
}

class Order {
    private List<Observer> observers = new ArrayList<>();
    private String status;
    
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
    
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}

class CustomerObserver implements Observer {
    private String customerName;
    
    public CustomerObserver(String name) {
        this.customerName = name;
    }
    
    @Override
    public void update(String status) {
        System.out.println("Notification to " + customerName + ": Order status changed to " + status);
    }
}

class DeliveryPersonObserver implements Observer {
    private String deliveryPersonName;
    
    public DeliveryPersonObserver(String name) {
        this.deliveryPersonName = name;
    }
    
    @Override
    public void update(String status) {
        System.out.println("Notification to " + deliveryPersonName + ": Order status changed to " + status);
    }
}
