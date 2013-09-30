package com.dptest.behavioralpattern.templatemethod;

public class ExcelDataParser extends DataParser {
	
	@Override
	void readData() {
        System.out.println("Reading data from excel file");
    }
	
	@Override
    void processData() {
        System.out.println("Looping through loaded excel file");    
    }

}
