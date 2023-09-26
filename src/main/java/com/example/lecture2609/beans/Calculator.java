package com.example.lecture2609.beans;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Calculator {
    private double start;
    private double end;
    private double step;

    private List<Point> points;

    public Calculator() {}

    public Calculator(double start, double end, double step) {
        this.start = start;
        this.end = end;
        this.step = step;

        tabulate();
    }

    public List<Point> tabulate() {
        points = new ArrayList<>();
        int n = (int) Math.round((end - start) / step + 1);
        for (int i = 0; i < n; i++) {
            points.add(new Point(start + i * step, f(start + i * step)));
        }
        return points;
    }

    public double f(double x) {
        return Math.cos(x) + Math.sin(x);
    }

    public double getMaxY() {
        return points.stream().mapToDouble(Point::getY).max().getAsDouble();
    }

    public double getMinY() {
        return points.stream().mapToDouble(Point::getY).min().getAsDouble();
    }


}
