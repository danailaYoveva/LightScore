package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import nl.saxion.re.sponsorrun.data.Data;
import nl.saxion.re.sponsorrun.util.WindowHelper;

import nl.saxion.re.sponsorrun.data.TournamentData;
import nl.saxion.re.sponsorrun.data.Tournament;
import org.controlsfx.control.spreadsheet.Grid;

import java.util.ArrayList;

public class TournamentScreenController {
    @FXML
    public Label label1;

    //t.name
    @FXML
    public Label tournamentLabel;

    //t.image
    @FXML
    public ImageView tournamentImage;

    @FXML
    public GridPane tournamentGrid;

    @FXML
    public ImageView imageView;

    @FXML
    public ArrayList<Tournament> tournaments;

    @FXML
    public void initialize() {
        imageView.setImage(new Image(getClass().getResource("/image/logo.png").toExternalForm()));

        tournaments = TournamentData.tournaments;

        int column = 0;
        int row = 0;

        for (Tournament tournament : tournaments) {
            VBox card = createTournamentCard(tournament);

            tournamentGrid.add(card, column, row);

            column++;
            if (column >= 3) {
                column = 0;
                row++;
            }
        }
    }

    private VBox createTournamentCard(Tournament t) {
        VBox card = new VBox(10);
        card.getStyleClass().add("tournament-card");
        card.setPrefSize(200, 150);

        Image img = new Image(getClass().getResource("/image/" + t.image).toExternalForm());

        ImageView imageView = new ImageView(img);
        imageView.setFitWidth(200);
        imageView.setFitHeight(142);
        imageView.getStyleClass().add("tournament-image");

        HBox innerCard = new HBox(10);
        innerCard.setAlignment(Pos.CENTER);
        innerCard.getStyleClass().add("tournament-inner");

        Label nameLabel = new Label(t.name);
        Button viewButton = new Button("View");

        viewButton.setOnAction(e -> openTournamentDetails(t));

        innerCard.getChildren().addAll(nameLabel, viewButton);
        card.getChildren().addAll(imageView, innerCard);
        return card;
    }

    private void openTournamentDetails(Tournament tournament) {
        System.out.println("Opening details for " + tournament.name);
    }

    @FXML
    protected void onFirstButtonClick() {
        WindowHelper.openWindow("another-screen.fxml", "Create a Tournament", 750, 600);
    }
}
