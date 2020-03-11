package perpchallange.model;

import java.io.*;

public class Sorter extends Thread{
    private String srcFile;
    private String dstFile;

    public Sorter(String srcFile, String dstFile) {
        super("Sorter");
        this.srcFile = srcFile;
        this.dstFile = dstFile;
    }

    public void write(int intToWrite){
        try{
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(dstFile, true))){
                bw.write(Integer.toString(intToWrite));
                bw.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void run() {
        try{
            try(LineNumberReader lnr = new LineNumberReader(new FileReader(srcFile))){
                String intToRead;
                while(true){ 
                    if((intToRead = lnr.readLine()) != null){
                        if(!intToRead.isEmpty()){
                            write(Integer.valueOf(intToRead));
                            System.out.println(getName() + ": wrote " + intToRead + " to " + dstFile);
                            System.out.println("line number:" + lnr.getLineNumber());
                        }
                    } else {
                        System.out.println(getName() + ": had nothing to write to " + dstFile);
                    }
                    Thread.sleep(2000);
                }
            }

        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
