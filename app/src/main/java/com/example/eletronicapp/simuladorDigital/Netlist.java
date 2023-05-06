package com.example.eletronicapp.simuladorDigital;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

public class Netlist {
    private List<String> lines;
    private List<String> parameters;
    private int counter;
    private String[] rawLines;
    private String[] rawParam;

    public Netlist(EditText editText) {
        lines = new ArrayList<>();
        String text = editText.getText().toString();
        rawLines = text.split("\n");
        for (String line : rawLines) {
            String cleanedLine = line.trim().replaceAll("\\s+", " ");
            if (!cleanedLine.isEmpty()) {
                lines.add(cleanedLine);
            }
        }
        // text = text.replaceAll("\n", "").replaceAll("\r", "");
        rawParam = text.split("\\s+");
        for (String param : rawParam) {
            String cleanedLine = param.trim().replaceAll("\\s+", "");
            if (!cleanedLine.isEmpty()) {
                parameters.add(cleanedLine);
            }
        }
    }





    public List<String> getLines() {
        return lines;
    }

    public List<String> getParameters() {
        return parameters;
    }

}

