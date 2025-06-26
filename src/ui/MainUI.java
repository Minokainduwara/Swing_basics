package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JComboBox genrecombo;
    private JComboBox typecombo;
    private JTextField minVotesField;
    private JButton episodeButton;
    private JButton imdBButton;


    public MainUI() {
        createTable();
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createTable() {
        Object[][] data = {
                {"Attack on Titan", 2013, 8.5, 500000},
                {"Death Note", 2006, 8.6, 450000},
                {"Fullmetal Alchemist: Brotherhood", 2009, 9.1, 600000},
                {"Demon Slayer: Kimetsu no Yaiba", 2019, 8.7, 400000},
                {"Naruto: Shippuden", 2007, 8.3, 350000},
                {"One Punch Man", 2015, 8.7, 380000},
                {"My Hero Academia", 2016, 8.3, 300000},
                {"Steins;Gate", 2011, 9.0, 280000},
                {"Hunter x Hunter (2011)", 2011, 9.0, 320000},
                {"Cowboy Bebop", 1998, 8.8, 250000}
        };
        showTable.setModel(new DefaultTableModel(
                data,
                new String[] {
                        "Title",
                        "Year",
                        "Rating",
                        "Num Votes"
                }
        ));
    }
}
