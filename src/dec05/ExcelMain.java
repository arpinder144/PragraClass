package dec05;

public class ExcelMain {
    public static void main(String[] args) {
        ExcelSheet excelSheet=new ExcelSheet("20","30");
        System.out.println(excelSheet.getColumn());
        System.out.println(excelSheet.getRow());
        //excelSheet.show();
    }
}
