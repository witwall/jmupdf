package com.examples.pdf.convert;

import com.jmupdf.enums.ImageType;
import com.jmupdf.exceptions.DocException;
import com.jmupdf.exceptions.DocSecurityException;
import com.jmupdf.page.Page;
import com.jmupdf.pdf.PdfDocument;

/**
 * Create a PNG file
 *
 */
public class Pdf_2_Png {

	public static void main(String[] args) {

		try {

			/*
			 * Open document
			 */
			PdfDocument pdfDoc = new PdfDocument("c:\\tmp\\test-1.pdf");

			/*
			 * Create JPeg file
			 */
			pdfDoc.saveAsPng(
					1,									// Page number
					"c:\\tmp\\test-1.png",				// PNG file
					Page.PAGE_ROTATE_90,				// rotate 
					2f,									// Zoom	
					ImageType.IMAGE_TYPE_RGB, 			// Color space. Only RGB, ARGB & Gray.
					1f);								// gamma 

			/*
			 * Dispose
			 */
			pdfDoc.dispose();

		} catch (DocException e) {
			e.printStackTrace();
		} catch (DocSecurityException e) {
			e.printStackTrace();
		}
		
	}

}
