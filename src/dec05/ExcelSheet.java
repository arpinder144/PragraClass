package dec05;

public class ExcelSheet {
    private String column;
    private String row;
    public ExcelSheet(String column, String row) {
        this.column = column;
        this.row = row;
    }

    public String getColumn() {
        return column;
    }


    public String getRow() {
        return row;
    }
    public void show(){
        System.out.println("Number of rows:"+row);
        System.out.println("Number of column:"+column);
    }


}
