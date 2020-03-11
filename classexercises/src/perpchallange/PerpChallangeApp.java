package perpchallange;

import perpchallange.model.NumberWriter;
import perpchallange.model.Sorter;

public class PerpChallangeApp {
    public static void main(String[] args) {
        String srcFile = "C:\\Users\\Admin\\GitProjects\\java\\classexercises\\src\\perpchallange\\files\\srcFile.txt";
        String evenFile = "C:\\Users\\Admin\\GitProjects\\java\\classexercises\\src\\perpchallange\\files\\evenFile.txt";
        String oddFile = "C:\\Users\\Admin\\GitProjects\\java\\classexercises\\src\\perpchallange\\files\\oddFile.txt";
//        NumberWriter.getInstance(srcFile).start();



        Sorter sorter = new Sorter(srcFile, evenFile);
        sorter.start();
    }
}
