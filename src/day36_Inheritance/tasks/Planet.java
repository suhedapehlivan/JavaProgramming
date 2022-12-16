package day36_Inheritance.tasks;

public class Planet {
    public String name;
    public double mass;
    public double radius;
    public String surfaceGravity;
    public String surfaceArea;
    public double volume;
    public int population;

    public Planet(String name, double mass, double radius, String surfaceGravity, String surfaceArea, double volume, int population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity='" + surfaceGravity + '\'' +
                ", surfaceArea='" + surfaceArea + '\'' +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
/*
1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()
 */