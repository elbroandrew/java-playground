package DI;

import DI.ReportWriter.PdfWriter;
import DI.dependency.WithDependencyInside;
import DI.no.dependency.NoDependencyClass;

public class Main {
    public static void main(String[] args) {

        WithDependencyInside wd = new WithDependencyInside();

        NoDependencyClass nd = new NoDependencyClass(new PdfWriter()); // just substitute PdfWriter with XlsWriter if needed

    }
}


