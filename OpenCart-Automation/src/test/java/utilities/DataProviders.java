package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
		
		String path=".\\testData\\opencartTestData.xlsx";
		
		ExcelUtils xlutil=new ExcelUtils(path);
		int totalrow=xlutil.getRowCount("Sheet1");
		int totalcol=xlutil.getCellCount("Sheet1", 1);
		String loginData[][]=new String[totalrow][totalcol];
		for(int i=1;i<=totalrow;i++) {
			for (int j=0;j<totalcol;j++) {
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
		}
		return loginData;
		
	}

}
