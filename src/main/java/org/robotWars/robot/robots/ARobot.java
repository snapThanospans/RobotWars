package org.robotWars.robot.robots;

import org.robotWars.robot.Direction;
import org.robotWars.robot.Position;

public class ARobot {

    private final String robotName;
    private Position currentPosition;
    private Direction currentDirection;
    private int lifeCounter;
//    private boolean activeStatus;

    public ARobot(String robotName) {
        this.robotName = robotName;
        this.currentDirection = Direction.NORTH;
        this.lifeCounter = 5;
//        this.activeStatus = true;
    }

    public String getRobotName() {
        return robotName;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void updatePosition(Position newPosition) {
        this.currentPosition = newPosition;
    }

    public void updateDirection(Direction newDirection) {
        this.currentDirection = newDirection;
    }

//    public boolean updateStatus() {
//
//    }

}
