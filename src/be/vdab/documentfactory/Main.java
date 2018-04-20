package be.vdab.documentfactory;

public class Main {

	public static void main(String[] args) {
		DocumentFactory factory = new DocumentFactory();
		Document document = factory.open("mijn_excel.xlsx");
		
		document.print();
		document.printPreview();

	}

}
