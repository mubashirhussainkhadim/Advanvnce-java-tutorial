package com.mubashir;
class Cylinder {
    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

/**
 * QuestionConstructorAndModifier
 */

public class QuestionConstructorAndModifier {

    public static void main(String[] args) {
        Cylinder  mCylinder = new Cylinder();
        mCylinder.setHeight(12);
        mCylinder.setRadius(8);
    }
}