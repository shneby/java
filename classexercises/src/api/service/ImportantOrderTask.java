package api.service;

import api.model.Order;

import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

public class ImportantOrderTask implements Runnable {
    private Set<Order> orders;
    private Boolean exit = false;

    public ImportantOrderTask(Set<Order> orders) {
        this.orders = orders;
    }

    public void setExit(Boolean exit) {
        this.exit = exit;
    }

    @Override
    public String toString() {
        return "ImportantOrderTask{" +
                "orders=" + orders +
                ", exit=" + exit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImportantOrderTask that = (ImportantOrderTask) o;
        return Objects.equals(orders, that.orders) &&
                Objects.equals(exit, that.exit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders, exit);
    }

    @Override
    public void run() {
        System.out.println("Monitoring important orders");
        while(!exit){
            for(Order order: orders){
                int orderNotificationCounter = order.getNotificationCounter();

                Calendar now = Calendar.getInstance();
                now.set(Calendar.MILLISECOND, 0);
                now.set(Calendar.SECOND, 0);

                if(order.getImportant() && order.getPopped() && orderNotificationCounter < 3){
                    if(now.compareTo(order.getNextImportantNotification()) >= 0){
                        orderNotificationCounter++;
                        order.setNotificationCounter(orderNotificationCounter);

                        String message = String.format("Priority notification: (%d/3) order is ready %s", orderNotificationCounter, order);
                        System.out.println(message);

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
        System.out.println("Important orders Monitoring system shut down");
    }
}
