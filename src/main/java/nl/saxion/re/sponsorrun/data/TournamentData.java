package nl.saxion.re.sponsorrun.data;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import javafx.scene.control.Alert;
import nl.saxion.re.sponsorrun.util.WindowHelper;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TournamentData {
    public static ArrayList<Tournament> tournaments = new ArrayList<>();
    public static Tournament currentTournament;

    public static void updateFromDisk() {
        // clear the list
        tournaments.clear();
        // read all rows and columns from the csv
        ArrayList<String[]> allRows = readData("tournaments.csv", ';', true);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // create politician objects from all the rows/columns and add to the ArrayList.
        for (String[] row : allRows) {
            Tournament t = new Tournament();

            t.id = Integer.parseInt(row[0]);
            t.name = row[1];
            t.sport = row[2];
            t.date = LocalDate.parse(row[3], formatter);
            t.registrationDate = LocalDate.parse(row[4], formatter);
            t.address = row[5];
            t.image = row[6];
            t.description = row[7];

            tournaments.add(t);
        }
    }

    private static ArrayList<String[]> readData(String csvFile, char separator, boolean skipRow) {
        try {
            // what a horrible syntax for configuring the csvparser. But ok.
            // da brat naistina
            CSVReaderBuilder readerBuilder = new CSVReaderBuilder(new FileReader(csvFile));
            if (skipRow) {
                readerBuilder.withSkipLines(1);
            }
            CSVParserBuilder parserBuilder = new CSVParserBuilder();
            parserBuilder.withSeparator(separator);
            readerBuilder.withCSVParser(parserBuilder.build());
            CSVReader reader = readerBuilder.build();

            ArrayList<String[]> allLines = new ArrayList<>(reader.readAll());
            return allLines;
        } catch (IOException e) {
            WindowHelper.showAlert("An error occurred reading " + csvFile + "\n\n" + e, Alert.AlertType.ERROR);
        }
        return new ArrayList<>();
    }
}
