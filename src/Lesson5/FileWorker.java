package Lesson5;

import java.io.*;

public class FileWorker {
    public static void  copyFile(File in, File out) throws IOException {
        if (in == null || out == null) {
            throw new IllegalArgumentException("Null");
        }

        try(InputStream inSt = new FileInputStream(in); OutputStream ouSt = new FileOutputStream(out)) {

            int byteCopy = 0;
            byte [] bufferArray = new byte[1024*1024];

            for (; (byteCopy = inSt.read(bufferArray)) > 0;){
                ouSt.write(bufferArray, 0, byteCopy);
            }



        } catch (IOException e) {
            throw e;
        }
    }
}
