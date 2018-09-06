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
public class Soldier {
    
    private String name;
    
    public Soldier(String name)
    {
        this.name = name;
    }
    
    public void startPushUps()
    {
        System.out.println("Private " + name + " is pushing up");
    }
    
    public void stopPushUps()
    {
        System.out.println("Private " + name + " stoped pushing up");
    }
    
    public void startRunning()
    {
        System.out.println("Private " + name + " is running");
    }
    
    public void stopRunning()
    {
        System.out.println("Private " + name + " stoped running");
    }
    
    public void startShutting()
    {
        System.out.println("Private " + name + " is shutting");
    }
    
    public void stopShutting()
    {
        System.out.println("Private " + name + " stoped shutting");
    }
}