package com.sda.factorymethod;

public class Main {

    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();

        Robot robot1 = robotFactory.makeRobot(TypeRobot.ACCOUNTING_ROBOT);
        robot1.work();

        Robot robot2 = robotFactory.makeRobot(TypeRobot.DRILLING_ROBOT);
        robot2.work();

        Robot robot3 = robotFactory.makeRobot(TypeRobot.BAD_JOKE_ROBOT_ROBOT);
        robot3.work();


    }
}
