/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author cchoi
 */
public class BaseballController {
    
    @FXML private ListView lvteams;
    @FXML private TableView tblResult;
    @FXML private TableColumn <String, Player> colPlayer;
    @FXML private TableColumn <String, Player> colAverage;
    
    private final List<Player> players = new ArrayList<>();
    
    private final String DIR = System.getProperty("user.dir");
    
    public void initialize(URL location, ResourceBundle resources){
    
    }
    
    private static class Player {

        public Player() {
        }
    }
    
    
    
}
