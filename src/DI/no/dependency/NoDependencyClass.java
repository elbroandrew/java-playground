package DI.no.dependency;

import DI.ReportWriter.ReportWriter;

public class NoDependencyClass {

    ReportWriter rw;

    public NoDependencyClass(ReportWriter rw){
        this.rw = rw;
        rw.write();
    }
}
