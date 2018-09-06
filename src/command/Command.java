/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import command.implementations.ListOfOrders;
import command.implementations.PushUps;
import command.implementations.Running;
import command.implementations.Shutting;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author AJuda
 */
public class Command {

    public static void main(String[] args) {
        
        Sergeant sergeant = new Sergeant();
        Soldier soldier1 = new Soldier("Bebz");
        Soldier soldier2 = new Soldier("Kebz");
        Soldier soldier3 = new Soldier("Owicz");
        
        Running running = new Running(soldier1);
        Shutting shutting = new Shutting(soldier2);
        
        sergeant.setOrder(running);
        sergeant.giveOrder();
        sergeant.setOrder(shutting);
        sergeant.giveOrder();
        sergeant.stopExecuting();
        
        ArrayList<Order> orderList = new ArrayList<Order>();
        orderList.addAll(Arrays.asList(new Running(soldier3)
                , new Shutting(soldier3), new PushUps(soldier3)));
        ListOfOrders listOfOrders = new ListOfOrders(orderList);
        sergeant.setOrder(listOfOrders);
        sergeant.giveOrder();        
    }
    
}
