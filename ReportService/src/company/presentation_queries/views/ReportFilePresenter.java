package company.presentation_queries.views;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import company.core.application.interfaces.ReportPresenter;

public class ReportFilePresenter implements ReportPresenter {

    private String fileName;

    public ReportFilePresenter(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void saveReportToFile(ArrayList<String> reportList){
        try (FileWriter writer = new FileWriter(this.fileName + ".doc", false)) {
            writer.write("<?Doc Format>\n");
            for (String line: reportList){
                writer.write(line);;
            }
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
    @Override
    public void printReport(ArrayList<String> reportList) {
    }
}

