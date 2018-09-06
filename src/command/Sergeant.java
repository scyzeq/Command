/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author AJuda
 */
public class Sergeant {
    private Order whatOrder;
    
    public void setOrder(Order order)
    {
        whatOrder = order;
    }
    
    public void giveOrder()
    {
        whatOrder.carryOut();
    }
    
    public void stopExecuting()
    {
        whatOrder.stopExecuting();
    }
}
