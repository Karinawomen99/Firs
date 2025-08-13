package Clean.code.dz2.task9;

public class DocumentAdapter implements  DocumentProcessor{
    private PDFProcessor pdfProcessor = new PDFProcessor();
    private DOCProcessor docProcessor = new DOCProcessor();
    @Override
    public void process(String fileName){
        if (fileName.endsWith("pdf")){
            pdfProcessor.readPDF(fileName);
            String converted = pdfProcessor.convertDoc(fileName);
            docProcessor.process(converted);
        }
        else  if (fileName.endsWith("doc")){
            docProcessor.process(fileName);
        }else {
            System.out.println("Неподдерживаемый формат"+fileName);
        }
    }
}
