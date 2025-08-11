package Clean.code.dz2.task9;

public class DOCProcessor implements DocumentProcessor {
    @Override
    public void process(String fileName){
        System.out.println("Обработываю DOC файл"+ fileName);
    }
}
