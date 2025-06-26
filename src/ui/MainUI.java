package ui;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JComboBox<String> genreCombo;  // Fixed variable name (was genrecombo)
    private JComboBox<String> typeCombo;   // Fixed variable name (was typecombo)
    private JTextField minVotesField;
    private JButton episodeButton;
    private JButton imdBButton;

    public MainUI() {
        createTable();
        createGenreCombo();
        createTypeCombo();
    }

    private void createTypeCombo() {
        typeCombo.setModel(new DefaultComboBoxModel<>(
                new String[] {"All", "Movie", "TV Show", "Short"}
        ));
    }

    private void createGenreCombo() {
        genreCombo.setModel(new DefaultComboBoxModel<>(
                new String[] {"All", "Action", "Fantasy", "Adventure", "Sci-Fi"}
        ));
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
                new String[] {"Title", "Year", "Rating", "Num Votes"}
        ) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return switch (columnIndex) {
                    case 0 -> String.class;
                    case 1 -> Integer.class;
                    case 2 -> Double.class;
                    case 3 -> Integer.class;
                    default -> Object.class;
                };
            }
        });

        // Column configuration
        TableColumnModel columnModel = showTable.getColumnModel();
        columnModel.getColumn(0).setMinWidth(200);

        // Center align all cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);  // Fixed from JLabel.CENTER

        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setCellRenderer(centerRenderer);
        }

        // Center align headers
        JTableHeader header = showTable.getTableHeader();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }
}