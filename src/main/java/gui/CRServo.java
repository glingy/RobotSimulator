package gui;

/**
 * Created by gregory.ling on 1/2/18.
 */

public interface CRServo {
    double MIN_POSITION = 0.0;
    double MAX_POSITION = 1.0;
    enum Direction {FORWARD, REVERSE}
    void setDirection(Direction direction);
    Direction getDirection();
    void setPower(double power);
    double getPower();
}
