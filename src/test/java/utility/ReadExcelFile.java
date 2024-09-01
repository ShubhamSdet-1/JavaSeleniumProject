package utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

    private String filePath;

    public ReadExcelFile(String filePath) {
        this.filePath = filePath;
    }

    public String readInputFromExcel(String columnName) throws IOException {
        String attributeValue = null;

        // Open a new FileInputStream each time the method is called
        try (FileInputStream file = new FileInputStream(this.filePath);
             Workbook workbook = new XSSFWorkbook(file)) {
            
            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getLastRowNum();

            for (int i = 1; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                Cell cell0 = row.getCell(0);
                String cellValue0 = cell0.getStringCellValue();
                if (columnName.equals(cellValue0)) {
                    Cell cell1 = row.getCell(1);
                    switch (cell1.getCellType()) {
                        case STRING:
                            attributeValue = cell1.getStringCellValue();
                            break;
                        default:
                            System.out.println("The cell type is - " + cell1.getCellType());
                            break;
                    }
                    break; // Exit the loop once the desired column is found
                }
            }
        } 
        return attributeValue;
    }

    public static void main(String[] args) throws IOException {
        ReadExcelFile readExcel = new ReadExcelFile("C:\\Users\\srajp\\eclipse-workspace\\StoreProject\\inputFile.xlsx");
        System.out.println(readExcel.readInputFromExcel("Enter_username"));
        System.out.println(readExcel.readInputFromExcel("Enter_password"));
    }
}
