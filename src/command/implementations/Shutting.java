/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.implementations;

import command.Order;
import command.Soldier;

/**
 *
 * @author AJuda
 */
public class Shutting implements Order{

    private Soldier soldier;
    
    public Shutting(Soldier soldier)
    {
        this.soldier = soldier;
    }
    
    @Override
    public void carryOut() 
    {
        soldier.startShutting();
    }

    @Override
    public void stopExecuting() 
    {
        soldier.stopRunning();
    }
    
}
