package ua.edu.chmnu.fks.oop.Lab9

class FileOperationTest extends GroovyTestCase {
    void testCopyFile() {
        File file =new File(System.getProperty("user.dir"),"text.txt");
        FileOperation fileOperation=new FileOperation();
        fileOperation.copyFile(file);
        File pathFile=new File(file.getParent()+"/NewFolder/",file.getName());
        assertEquals(true,pathFile.exists())
    }
}
