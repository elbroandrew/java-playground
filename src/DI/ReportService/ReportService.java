package DI.ReportService;

import DI.ReportWriter.ReportWriter;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    ReportWriter rw;

    public ReportService(ReportWriter rw){
        this.rw = rw;

    }

    public void report(){
        rw.write();
    }
}
