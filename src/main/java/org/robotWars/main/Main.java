package org.robotWars.main;

import org.json.JSONObject;
import org.robotWars.robot.command.ACommand;
import org.robotWars.robot.robots.ARobot;
import org.robotWars.robot.robots.LongShot;

public class Main {

    public static void main(String[] args) {
        ARobot robot = new LongShot("Ntokozo");
        ACommand command = ACommand.createCommand("forward");
        JSONObject response = command.execute(robot, "10");
    }

}
