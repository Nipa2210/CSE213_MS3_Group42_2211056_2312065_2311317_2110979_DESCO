package com.example.group42_desco.Nabiha;

public class HRManagerEvaluatingPerformance {
    private String name,designation,performance;
    private int id;


    public HRManagerEvaluatingPerformance(String designation, int id, String name, String performance) {
        this.designation = designation;
        this.id = id;
        this.name = name;
        this.performance = performance;
    }


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }


    @Override
    public String toString() {
        return "HRManagerEvaluatingPerformance{" +
                "designation='" + designation + '\'' +
                ", name='" + name + '\'' +
                ", performance='" + performance + '\'' +
                ", id=" + id +
                '}';
    }
}
