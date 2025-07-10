package DI;

import DI.ReportService.ReportService;
import DI.ReportWriter.PdfWriter;
import DI.dependency.WithDependencyInside;
import DI.no.dependency.NoDependencyClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        // 1.Dependency
        WithDependencyInside wd = new WithDependencyInside();
        // 2. No Dep
        NoDependencyClass nd = new NoDependencyClass(new PdfWriter()); // just substitute PdfWriter with XlsWriter if needed


        // 3. SPRING DI
        var context = getSpringContext("pdf-report");  // здесь просто меняю на 'xls-report', если надо
        ReportService reportService = context.getBean(ReportService.class);
        reportService.report();

        context.close();

    }
    //for SPRING DI
    private static AnnotationConfigApplicationContext getSpringContext(String profile){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(Configuration.class);
        context.refresh();
        return context;

    }
}


