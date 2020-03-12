package api.app;

import api.model.OrderSystem;
import api.service.ImportantOrderTask;
import api.service.OrderTask;

public class Run {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();

        OrderTask orderTask = new OrderTask(orderSystem.getOrders());
        ImportantOrderTask importantOrderTask = new ImportantOrderTask(orderSystem.getOrders());

        Thread monitor = new Thread(orderTask, "orderMonitor");
        Thread priorityMonitor = new Thread(importantOrderTask, "priorityOrderMonitor");

        monitor.start();
        priorityMonitor.start();

        while(!orderSystem.getExit()){
            orderSystem.orderMenu();
        }

        importantOrderTask.setExit(true);
        orderTask.setExit(true);
    }
}
