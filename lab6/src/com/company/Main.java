package com.company;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        int lastLandY = 7001;
        int lastLandX = 3001;
        boolean flag = true;
        int xLeft = 0;
        int xRight = 0;
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            if (lastLandY == landY) {
                flag = false;
                xRight = landX;
                xLeft = lastLandX;
            }
            if (flag) {
                lastLandX = landX;
                lastLandY = landY;
            }
        }
        // game loop
        int maxVSpeed = 40;
        int maxHSpeed = 20;
        int maxPower = 4;
        int angle;
        double marsGavity = 3.711;
        double speedTakingIntoAccountHSpeedAndVspeed;
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).

            if (xLeft > X || X > xRight) {
                if (((X < xLeft && hSpeed < 0) || (X > xRight && hSpeed > 0)) || (Math.abs(hSpeed) > maxHSpeed * maxPower)) {
                    speedTakingIntoAccountHSpeedAndVspeed = Math.pow((double)(hSpeed * hSpeed + vSpeed * vSpeed), 0.5);
                    angle = (int) Math.toDegrees(Math.asin((double)hSpeed/speedTakingIntoAccountHSpeedAndVspeed));
                    System.out.println(angle + " 4");
                }
                else if (Math.abs(hSpeed) < maxPower/2 * maxHSpeed) {
                    angle = (int) Math.toDegrees(Math.acos(marsGavity / 4.0));
                    if (X < xRight) {
                        angle = -1 * angle;
                    }
                    System.out.println(angle + " 4");
                }
                else {
                    if (vSpeed >= 0) {
                        System.out.println("0 3");
                    }
                    else {
                        System.out.println("0 4");
                    }
                }

            }
            if (xLeft <= X && X <= xRight)  {
                if (Y < lastLandY + 20) {
                    System.out.println("0 3");
                }
                else if (Math.abs(hSpeed) <= 15 && Math.abs(vSpeed) <= 35) {
                    System.out.println("0 2");
                }
                else {
                    speedTakingIntoAccountHSpeedAndVspeed = Math.pow((double)(hSpeed * hSpeed + vSpeed * vSpeed), 0.5);
                    angle = (int) Math.toDegrees(Math.asin((double)hSpeed/speedTakingIntoAccountHSpeedAndVspeed));
                    System.out.println(angle + " 4");
                }
            }
        }
    }
}
