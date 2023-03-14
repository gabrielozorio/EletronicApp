package com.example.eletronicapp.simuladorDigital;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

public class Netlist {
    private List<String> lines;

    public Netlist(EditText editText) {
        lines = new ArrayList<>();
        String text = editText.getText().toString();
        String[] rawLines = text.split("\n");
        for (String line : rawLines) {
            String cleanedLine = line.trim().replaceAll("\\s+", " ");
            if (!cleanedLine.isEmpty()) {
                lines.add(cleanedLine);
            }
        }
    }

    public List<String> getLines() {
        return lines;
    }


}

