package com.stepdefinitions;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import java.util.ArrayList;
	import java.util.List;

	public class WebTableUtils {

	    private WebDriver driver;

	    public WebTableUtils(WebDriver driver) {
	        this.driver = driver;
	    }

	    /**
	     * Fetch data from a specific cell in the table.
	     *
	     * @param tableLocator Locator for the table element.
	     * @param rowNumber     Row number (1-based index).
	     * @param colNumber     Column number (1-based index).
	     * @return The cell data as a String.
	     */
	    public String getCellData(By tableLocator, int rowNumber, int colNumber) {
	        WebElement table = driver.findElement(tableLocator);
	        WebElement cell = table.findElement(By.xpath(".//tr[" + rowNumber + "]/td[" + colNumber + "]"));
	        return cell.getText();
	    }

	    /**
	     * Fetch all data from a specific row in the table.
	     *
	     * @param tableLocator Locator for the table element.
	     * @param rowNumber     Row number (1-based index).
	     * @return List of Strings containing data from each cell in the row.
	     */
	    public List<String> getRowData(By tableLocator, int rowNumber) {
	        WebElement table = driver.findElement(tableLocator);
	        List<WebElement> cells = table.findElements(By.xpath(".//tr[" + rowNumber + "]/td"));
	        List<String> rowData = new ArrayList<>();
	        for (WebElement cell : cells) {
	            rowData.add(cell.getText());
	        }
	        return rowData;
	    }

	    /**
	     * Fetch all data from a specific column in the table.
	     *
	     * @param tableLocator Locator for the table element.
	     * @param colNumber     Column number (1-based index).
	     * @return List of Strings containing data from each cell in the column.
	     */
	    public List<String> getColumnData(By tableLocator, int colNumber) {
	        WebElement table = driver.findElement(tableLocator);
	        List<WebElement> cells = table.findElements(By.xpath(".//tr/td[" + colNumber + "]"));
	        List<String> colData = new ArrayList<>();
	        for (WebElement cell : cells) {
	            colData.add(cell.getText());
	        }
	        return colData;
	    }

	    /**
	     * Fetch all data from the table.
	     *
	     * @param tableLocator Locator for the table element.
	     * @return 2D List of Strings containing all data from the table.
	     */
	    public List<List<String>> getAllTableData(By tableLocator) {
	        WebElement table = driver.findElement(tableLocator);
	        List<WebElement> rows = table.findElements(By.xpath(".//tr"));
	        List<List<String>> tableData = new ArrayList<>();

	        for (WebElement row : rows) {
	            List<WebElement> cells = row.findElements(By.xpath(".//td"));
	            List<String> rowData = new ArrayList<>();
	            for (WebElement cell : cells) {
	                rowData.add(cell.getText());
	            }
	            tableData.add(rowData);
	        }
	        return tableData;
	    }

	    /**
	     * Get the number of rows in the table.
	     *
	     * @param tableLocator Locator for the table element.
	     * @return Number of rows in the table.
	     */
	    public int getRowCount(By tableLocator) {
	        WebElement table = driver.findElement(tableLocator);
	        List<WebElement> rows = table.findElements(By.xpath(".//tr"));
	        return rows.size();
	    }

	    /**
	     * Get the number of columns in the table (from the first row).
	     *
	     * @param tableLocator Locator for the table element.
	     * @return Number of columns in the table.
	     */
	    public int getColumnCount(By tableLocator) {
	        WebElement table = driver.findElement(tableLocator);
	        WebElement firstRow = table.findElement(By.xpath(".//tr[1]"));
	        List<WebElement> columns = firstRow.findElements(By.xpath(".//td"));
	        return columns.size();
	    }
	}


