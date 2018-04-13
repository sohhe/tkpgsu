package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ScannerWrapper sw = new ScannerWrapper();
        Computer computer = new Computer();

        FileWorker fw = new FileWorker();

        System.out.println("Input numbers of cumputers");
        int lenght = sw.readInt();

        ArrayList<Computer> list = new ArrayList<>();
        for (int i = 0; i < lenght; i++) {
            System.out.println("Input frequency of processor");
            try {
                computer.setFrequency(sw.readDouble());
            } catch (ComputerExeption computerExeption) {
                System.out.println("Take positive number");;
            }
            System.out.println("Input ram");
            computer.setRam(sw.readDouble());
            System.out.println("Input videocard");
            computer.setVideoCard(sw.readLine());
            list.add(new Computer(
                    computer.getFrequency(),
                    computer.getRam(),
                    computer.getVideoCard(),
                    computer.getPerfomance()));
        }

        fw.write("manage.txt", list);
        fw.read("manage.txt");







    }

}
