package DI.ReportWriter;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("pdf-report")
public class PdfWriter implements ReportWriter {

    public void write(){
        System.out.println("PDF report created.");
    }
}
