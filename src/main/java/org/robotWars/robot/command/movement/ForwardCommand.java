package org.robotWars.robot.command.movement;

import org.json.JSONObject;
import org.robotWars.robot.command.ACommand;
import org.robotWars.robot.robots.ARobot;

public class ForwardCommand extends ACommand {
    @Override
    public JSONObject execute(ARobot robot, String InstructionDetails) {
        JSONObject response = new JSONObject();

        response.put("status", "OK");

        return response;
    }
}
