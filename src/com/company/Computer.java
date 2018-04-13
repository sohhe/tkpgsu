package com.company;

import java.io.Serializable;

public class Computer implements Serializable {
    private double frequency;
    private double ram;
    private String videoCard;
    private double perfomance;

    public Computer() {
    }

    public Computer(double frequency, double ram, String videoCard, double perfomance) {
        this.frequency = frequency;
        this.ram = ram;
        this.videoCard = videoCard;
        this.perfomance = perfomance;
    }


    public double getFrequency() {

        return frequency;
    }

    public void setFrequency(double frequency) throws ComputerExeption {
        if(frequency <= 0){
            throw new ComputerExeption();
        }
        this.frequency = frequency;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public double getPerfomance() {
        return perfomance = frequency*ram/2.3;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "frequency=" + frequency +
                ", ram=" + ram +
                ", videoCard='" + videoCard + '\'' +
                ", perfomance=" + perfomance +
                '}';
    }
}
