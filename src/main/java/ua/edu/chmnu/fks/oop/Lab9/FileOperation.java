package ua.edu.chmnu.fks.oop.Lab9;

import java.io.*;

public class FileOperation {
    public void copyFile(File file)//Переміщяє файл в корневій папці
    {
        File folder=new File(file.getParent()+"/NewFolder/");

        File pathFile=new File(folder,file.getName());
        if(!folder.exists()) {
            folder.mkdirs();
        }
        try
        {
            InputStream is= new FileInputStream(file);
            OutputStream os= new FileOutputStream(pathFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            is.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
