package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWorker {

    public void write(String filename,List<?> list){
        File file = new File(filename);

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(list);

            oos.close();
            fos.close();
        }catch(IOException ioe){
            System.out.println("something went wrong");

        }
    }

    public  void read(String filename){
        File file = new File(filename);
        ArrayList<Computer> list = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            list = (ArrayList<Computer>) ois.readObject();
            for (Computer cp: list) {
                System.out.println(cp);
            }

            ois.close();
            fis.close();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("something went wrong with read");
        }
       
    }

}
