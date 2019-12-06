package com.paramesh.looselycouple;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class FileGeneratorApp {

	public static void main(String[] args) {
		FileGenerator csv = new CsvGenerator();
		csv.generateOutput();
		FileGenerator xml = new XmlGenerator();
		xml.generateOutput();
		FileGenerator pdf = new PdfGenerator();
		pdf.generateOutput();
	}
}
