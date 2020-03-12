package api.model;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OrderSystem {
    private Set<Order> orders;
    private Boolean exit = false;

    public OrderSystem() {
        this.orders = new HashSet<>();
    }

    public Boolean getExit() {
        return exit;
    }

    public void addOrder(Order order){
        Calendar now = Calendar.getInstance();
        if(orders.contains(order)){
            System.out.println("Order already exists in the system");
        } else if (checkOrderSameReadyOn(order)) {
            System.out.println("Order with same readyOn time exists");
        } else if (order.getReadyOn().compareTo(now) < 0) {
            System.out.println("Order cannot be added with past time");
        } else {
            orders.add(order);
        }
    }

    public Set<Order> getOrders(){
        return orders;
    }

    public void orderMenu(){
        System.out.println("Order menu:\n1. add order\n2. view orders\n3. exit");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch(option){
            case 1:
                addOrder(takeOrder());
                break;
            case 2:
                for(Order order :getOrders()){
                    System.out.println(order);
                }
                break;
            case 3:
                exit = true;
                break;
        }
    }

    private Boolean checkOrderSameReadyOn(Order order){
        for(Order o: orders){
            if(o.getReadyOn().equals(order.getReadyOn())){
                return true;
            }
        }
        return false;
    }

    private Order takeOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("In how many hours the order will be ready:");
        int hours = scanner.nextInt();

        System.out.println("In how many minutes the order will be ready:");
        int minutes = scanner.nextInt();

        System.out.println("Enter order description:");
        String description = scanner.next();

        System.out.println("Is this a priority order? (y/n)");
        boolean priority = false;
        switch (scanner.next()){
            case "y":
                priority = true;
                break;
            case "n":
                break;
            default:
                System.out.println("Invalid option - expecting (y/n) setting order as not priority");
                break;

        }
        Calendar orderTime = Calendar.getInstance();
        orderTime.set(Calendar.SECOND, 0);
        orderTime.set(Calendar.MILLISECOND, 0);
        orderTime.add(Calendar.HOUR, hours);
        orderTime.add(Calendar.MINUTE, minutes);
        return new Order(orderTime, description, priority);
    }
}
