public class ReadTextFileTest{
    public static void main(String[] args){
        ReadTextFile application = new ReadTextFile();
        application.openFile();
        application.readRecord();
        application.closeFile();
    }
}
