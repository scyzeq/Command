/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.implementations;

import command.Order;
import java.util.ArrayList;

/**
 *
 * @author AJuda
 */
public class ListOfOrders implements Order{

    private ArrayList<Order> orderList;
    
    public ListOfOrders(ArrayList<Order> orderList)
    {
        this.orderList = orderList;
    }
    
    @Override
    public void carryOut() 
    {
        orderList.forEach(o -> o.carryOut());
    }

    @Override
    public void stopExecuting() 
    {
        orderList.forEach(o -> o.stopExecuting());
    }
    
}
