package DI.dependency;

import DI.ReportWriter.PdfWriter;

public class WithDependencyInside {

    public WithDependencyInside(){
        PdfWriter pdfWriter = new PdfWriter();  // to change to XLS we have to create a XlsWriter
        pdfWriter.write();
    }

}
