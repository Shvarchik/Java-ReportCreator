package company.presentation_queries.views;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import company.core.application.interfaces.ReportPresenter;

public class ReportFilePresenter implements ReportPresenter {

    @Override
    public void saveReportToFile(ArrayList<String> reportList, String path) {
        try (FileWriter writer = new FileWriter(path + ".doc", false)) {
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

