package replacewords;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

    private String filePath = "code.txt";
    File fileInput = new File(filePath);

    //Читать файл
    public String readFile() {
        String sText = "";
        try {
            //Чтение файла
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String strLine = "";
            //Если файл существует
            if (fileInput.exists()) {
                //Пока не конец строки
                while ((strLine = br.readLine()) != null) {
                    sText += strLine + "\n ";
                }
                br.close();
            } else {
                System.out.println("Файла не найден");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sText;
    }

    //Записывать файл
    public void writeFile(String sResultText) {
        String filePathResult = "result.txt";
        File fileOutput = new File(filePathResult);
        try {
            //Создать файл
            if (fileOutput.createNewFile()) {
                System.out.println(fileOutput + " Файл создан");
            }
            BufferedWriter writerText = new BufferedWriter(new FileWriter(filePathResult));
            //Разбить текст на слова
            String[] sWords = sResultText.split("\n");
            //Записать в файл
            for (int i = 0; i < sWords.length - 1; i++) {
                writerText.write(sWords[i] + "\r\n");
            }
            writerText.flush();
            writerText.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
