package perpchallange.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumberWriter extends Thread{
    private Random random = new Random();
    private String dstFile;
    private static NumberWriter instance;
    private NumberWriter(String dstFile){
        super("NumberWriter");
        this.dstFile = dstFile;
    }

    public static NumberWriter getInstance(String dstFile) {
        if(instance == null){
            instance = new NumberWriter(dstFile);
        }
        return instance;
    }

    public String getDstFile() {
        return dstFile;
    }

    public void setDstFile(String dstFile) {
        this.dstFile = dstFile;
    }

    public void write(){
        try{
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(dstFile, true))){
                int intToWrite = random.nextInt(101);
                bw.write(Integer.toString(intToWrite));
                bw.newLine();
                System.out.println(getName() + ": wrote " + intToWrite + " to " + dstFile);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(true){
            write();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
