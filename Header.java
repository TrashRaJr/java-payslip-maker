
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.border.DottedBorder;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPTableEvent;
import com.itextpdf.text.pdf.PdfWriter;

public class Header 
{
	public String generatePdf(String cName, String cAddress, String cTelephone, String cMobile, String cEmail, String cWebsite) 
	{
		Document doc = new Document(PageSize.A4, 50, 50, 50, 50);
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(cName+".pdf"));
			doc.open();
			
			//Company name, address and other details
			float fntSize, lineSpacing;
	        fntSize = 16f;
	        lineSpacing = 20f;
			Paragraph header = new Paragraph(new Phrase(lineSpacing,cName,FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize)));
	        header.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
	        doc.add(header);
	        
	        fntSize = 14f;
	        Paragraph address = new Paragraph(new Phrase(lineSpacing,cAddress,FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize)));
	        address.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
	        doc.add(address);
	        
	        fntSize = 8f;
	        lineSpacing = 16f;
	        Paragraph telephone = new Paragraph(new Phrase(lineSpacing,"Tel : " + cTelephone + "   " + "Mob. : " + cMobile + "   " + "E-Mail : " + cEmail + "   " + "Web : " + cWebsite,FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize)));
	        telephone.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
	        doc.add(telephone);
	        
	        fntSize = 18f;
	        lineSpacing = 35f;
	        Paragraph payslip = new Paragraph(new Phrase(lineSpacing,"PAYSLIP",FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize)));
	        payslip.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
	        doc.add(payslip);
	        
	        
	        Paragraph spacing = new Paragraph(new Phrase(lineSpacing,"     ",FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize)));
	        doc.add(spacing);
	        
	        PdfPTable general = new PdfPTable(4);
	        general.setWidthPercentage(100);
	        
	        Font f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        PdfPCell cell= new PdfPCell((new Phrase("Employee Code :",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("1001675657765",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("Duties - WO, PH : ",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("April 2005",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("Father's Name :",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("Dui Kumar",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("PL, CL, SL, OT : ",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("2.0, 3.0, 4.0, 1.00",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("Designation : ",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("Security Guard",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("Bank Name : ",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("ICICI",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("PF no. : ",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("3Q76464974",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("AC NO : ",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("9832649808",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("UAN NO : ",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("849836983",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("UNIT NAME :",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("Dolphin Pvt Ltd",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("ESI no. : ",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("9172648360",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        cell= new PdfPCell((new Phrase("Location :",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        f = new Font(FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
	        cell= new PdfPCell((new Phrase("Chirag Dilli",f)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        general.addCell(cell);
	        
	        doc.add(general);
	        
	        //Code for the table - Fields
	        spacing = new Paragraph(new Phrase(lineSpacing,"     ",FontFactory.getFont(FontFactory.TIMES_ROMAN, fntSize)));
	        doc.add(spacing);
	        float[] columnWidths = {5 , 3, 3 , 3 , 3};
	        PdfPTable table = new PdfPTable(columnWidths);
	        table.setWidthPercentage(100);
	        table.getDefaultCell().setBorder(Rectangle.LEFT);
	        
	        table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
	        
	        cell = new PdfPCell((new Phrase("Earnings",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setColspan(3);
	        table.addCell(cell);
	        
	        cell = new PdfPCell((new Phrase("Dedudction",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setColspan(2);
	        table.addCell(cell);
	        
	        cell = new PdfPCell((new Phrase("Description",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Rate",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Amount",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Description",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Amount",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        table.addCell(cell);
	        
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.RIGHT);
	        table.addCell(cell);
	        
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.RIGHT);
	        table.addCell(cell);
	        
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.RIGHT);
	        table.addCell(cell);
	        
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.RIGHT);
	        table.addCell(cell);
	        
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.LEFT);
	        table.addCell(cell);
	        cell = new PdfPCell((new Phrase("Text",f)));
	        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        cell.setBorder(Rectangle.RIGHT);
	        table.addCell(cell);
	        
			/*
			 * // // //The various categories // f = new Font(FontFamily.TIMES_ROMAN, 9,
			 * Font.NORMAL); // cell = new PdfPCell((new Phrase("Text:   text",f))); //
			 * cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED_ALL); //
			 * table.addCell(cell); // // cell = new PdfPCell((new
			 * Phrase("Text:   text",f))); //
			 * cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED_ALL); //
			 * table.addCell(cell); // // cell = new PdfPCell((new
			 * Phrase("Text:   text",f))); //
			 * cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED_ALL); //
			 * table.addCell(cell);
			 */	        
	        
	        
	        
	        
	        doc.add(table);
	        
	        
	        
	        
	        
	        
	        
	        doc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		String output = "Text inserted";
		System.out.println("DONE");
		return output;
	}
}
