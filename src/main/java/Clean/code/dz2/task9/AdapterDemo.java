package Clean.code.dz2.task9;

public class AdapterDemo {
    public static void main(String[] args) {
        DocumentProcessor processor =new DocumentAdapter();
        processor.process("report.pdf");
        processor.process("sumary.doc");
        processor.process("image.png");
    }
}
