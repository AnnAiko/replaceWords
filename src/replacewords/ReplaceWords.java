package replacewords;

public class ReplaceWords {

    public static void main(String[] args) {
        ReadWriteFile readWrite = new ReadWriteFile();
        //Прочитать текст с файла
        String sText = readWrite.readFile();
        //Заменить слова 
        String sTextResult = sText.replace("public", "private");
        System.out.println("Замена прошла успешно");
        readWrite.writeFile(sTextResult);

    }
}
