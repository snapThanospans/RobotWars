package org.robotWars.robot.command;

import org.json.JSONObject;
import org.robotWars.robot.command.movement.BackCommand;
import org.robotWars.robot.command.movement.ForwardCommand;
import org.robotWars.robot.robots.ARobot;

public abstract class ACommand {

    public abstract JSONObject execute(ARobot robot, String InstructionDetails);

    public static ACommand createCommand(String action) {

        switch(action){
            case "forward":
                return new ForwardCommand();
            case "back":
                return new BackCommand();

            default:
                return new ForwardCommand();
        }

    }


}
