package HW7Exceptions;

import java.io.*;

public class ClassA {
    private int var1;
    private int var2;
    private String var3;

   ClassA(int a, int b, String o){
        this.var1 = a;
        this.var2 =b;
        this.var3=o;
    }

    public void doSmth(){
        System.out.println(var1+var2+var3);
    }

    public  int getFromRepo() {
        int count = 0;
        try (FileReader fileReader = new FileReader("/Users/gorge/Desktop/Index1.txt");) {
            int chr =0;
            chr = fileReader.read();
            while (chr != -1) {
                chr = fileReader.read();
                count++;
            }
            System.out.println("\nКоличество символов в репозитории: "+count);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}

