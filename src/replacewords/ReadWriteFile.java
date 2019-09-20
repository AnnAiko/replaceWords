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

    //������ ����
    public String readFile() {
        String sText = "";
        try {
            //������ �����
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String strLine = "";
            //���� ���� ����������
            if (fileInput.exists()) {
                //���� �� ����� ������
                while ((strLine = br.readLine()) != null) {
                    sText += strLine + "\n ";
                }
                br.close();
            } else {
                System.out.println("����� �� ������");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sText;
    }

    //���������� ����
    public void writeFile(String sResultText) {
        String filePathResult = "result.txt";
        File fileOutput = new File(filePathResult);
        try {
            //������� ����
            if (fileOutput.createNewFile()) {
                System.out.println(fileOutput + " ���� ������");
            }
            BufferedWriter writerText = new BufferedWriter(new FileWriter(filePathResult));
            //������� ����� �� �����
            String[] sWords = sResultText.split("\n");
            //�������� � ����
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
