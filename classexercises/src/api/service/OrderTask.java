package api.service;

import api.model.Order;

import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

public class OrderTask implements Runnable {
    private Set<Order> orders;
    private Boolean exit = false;

    public OrderTask(Set<Order> orders) {
        this.orders = orders;
    }

    public void setExit(Boolean exit) {
        this.exit = exit;
    }

    @Override
    public String toString() {
        return "OrderTask{" +
                "orders=" + orders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderTask orderTask = (OrderTask) o;
        return Objects.equals(orders, orderTask.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public void run() {
        System.out.println("Monitoring orders");
        while(!exit){
            Calendar now = Calendar.getInstance();
            now.set(Calendar.MILLISECOND, 0);
            now.set(Calendar.SECOND, 0);
            for(Order order: orders){
                if(order.getReadyOn().compareTo(now) == 0 && !order.getPopped()){
                    System.out.println("Order is ready: " + order);
                    order.setPopped(true);
                    if (order.getImportant()){
                        now.add(Calendar.MINUTE, 1);
                        order.setNextImportantNotification(now);
                    }
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Monitoring system shut down");
    }
}
