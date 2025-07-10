package DI.ReportWriter;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("xls-report")
public interface ReportWriter {
    public void write();
}
