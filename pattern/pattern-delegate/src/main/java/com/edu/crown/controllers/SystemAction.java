package com.edu.crown.controllers;

/**
 * Created by Crown on 2018/7/15.
 */
public class SystemAction implements Action{

    @Override
    public void doget() {
        System.out.println("SystemAction doget");
    }
}
