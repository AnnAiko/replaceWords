package replacewords;

public class ReplaceWords {

    public static void main(String[] args) {
        ReadWriteFile readWrite = new ReadWriteFile();
        //��������� ����� � �����
        String sText = readWrite.readFile();
        //�������� ����� 
        String sTextResult = sText.replace("public", "private");
        System.out.println("������ ������ �������");
        readWrite.writeFile(sTextResult);

    }
}
