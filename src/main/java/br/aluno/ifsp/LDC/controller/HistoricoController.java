package br.edu.ifsp.javafx.aulas.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import br.edu.ifsp.javafx.aulas.App;
import br.edu.ifsp.javafx.aulas.dao.CedulaDAO;
import br.edu.ifsp.javafx.aulas.dao.MoedaMetalDAO;
import br.edu.ifsp.javafx.aulas.model.Cedula;
import br.edu.ifsp.javafx.aulas.model.MoedaMetal;
import br.edu.ifsp.javafx.aulas.model.Historico;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistoricoController {

    @FXML
    private Button btnExcluirHisto;

    @FXML
    private Button btnVoltar;

    @FXML
    private TableColumn<Historico, Double> colValor;

    @FXML
    private TableColumn<Historico, String> colID;

    @FXML
    private TableColumn<Historico, LocalDate> colData;

    @FXML
    private TableView<Historico> tabelaHistorico;

    public void initialize() {
        // Ensina para a coluna qual o campo deve ser invocado no objeto de Histórico
        colValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colData.setCellValueFactory(new PropertyValueFactory<>("data"));

        // Atribuir os dados para a tabela
        tabelaHistorico.setItems(
            // Obter os dados do histórico das cédulas e moedas
            FXCollections.observableList(obterHistorico())
        );

        // Configurar o evento do botão Excluir Histórico
        btnExcluirHisto.setOnAction(event -> excluirHistorico());
        
        btnVoltar.setOnAction((ActionEvent event) ->{ 
            Back();
            closeCurrentWindow(event);
        }); 

    }

    private List<Historico> obterHistorico() {
        List<Historico> historico = new ArrayList<>();

        // Obter o histórico das cédulas
        CedulaDAO cedulaDAO = CedulaDAO.getInstance();
        for (Cedula cedula : cedulaDAO.read()) {
            Historico itemHistorico = new Historico(cedula.getValor(), cedula.getIdMoeda(), LocalDate.now());
            historico.add(itemHistorico);
        }

        // Obter o histórico das moedas
        MoedaMetalDAO moedaMetalDAO = MoedaMetalDAO.getInstance();
        for (MoedaMetal moedaMetal : moedaMetalDAO.read()) {
            Historico itemHistorico = new Historico(moedaMetal.getValor(), moedaMetal.getIdMoeda(), LocalDate.now());
            historico.add(itemHistorico);
        }

        return historico;
    }

    public void excluirHistorico() {
        tabelaHistorico.getItems().clear();
    }

     private void closeCurrentWindow(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
    private void Back(){
        try {
            URL path = App.class.getResource("MenuLogado.fxml");
            Parent root = FXMLLoader.load(path);
        
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
