package Clean.code.dz1.dz2.task9;

public class PDFProcessor {
    public void readPDF(String fileName){
        System.out.println("Читаю PDF файл "+ fileName);
    }
    public String convertDoc(String fileName){
        String convertFile = fileName.replace("pdf","doc");
        System.out.println("Клонвертирую PDF->DOC"+convertFile);
        return convertFile;
    }
}
