package com.sda.factorymethod;

public class RobotFactory {

    public Robot makeRobot(TypeRobot typeRobot){

        if(typeRobot== TypeRobot.ACCOUNTING_ROBOT){
            return new AccountingRobot();
        }
        if(typeRobot==TypeRobot.DRILLING_ROBOT){
            return new DrillingRobot();
        }
        if(typeRobot==TypeRobot.BAD_JOKE_ROBOT_ROBOT){
            return new BadJokeRobot();
        }
        return null;
    }
}
