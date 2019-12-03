package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class tableview {
    static public Label l1 = new Label(" ");
    public static Button delete;
    public static Button butt;
    public static Button refresh;
    public static Button search;
    public static Button info;
    public static ArrayList<students> st = new ArrayList<>();
    static ObservableList<students> people = FXCollections.observableArrayList(st);
    static TableView<students> table = new TableView<students>(people);

    public static void actors(){
        st.add(new students("Давиденко Ілля Сергійович", 17, "2ПІ-18б", 2, "Денисюк Алла Василівна", 4.2));
        st.add(new students("Богомазов Данил Вікторович", 18, "2ПІ-18б", 2, "Денисюк Алла Василівна", 3.6));
        st.add(new students("Симон Андрій Дмитрийович", 16, "2ПІ-18б", 2, "Денисюк Алла Василівна", 3.2));
        st.add(new students("Ісаков Андрій ХХ", 18, "1ПІ-18б", 2, "Войтко Вікторія Володимирівна", 4.8));

    }

    public static void tabl() {
        l1.relocate(0,5);
        l1.setFont(Font.font(16));

        delete = new Button("Видалити студента");
        delete.relocate(0,20);

        butt = new Button("Додати студента");
        butt.relocate(0,10);
        butt.setOnAction(e -> control.addstudents());

        refresh = new Button("Оновити сторінку");
        refresh.relocate(10,30);
        refresh.setOnAction(e -> Main.update());

        search = new Button("Шукати студента");
        search.relocate(10,40);
        search.setOnAction(e -> control.search());

        info = new Button("Вивести інформацію");
        info.relocate(10,40);

        people = FXCollections.observableArrayList(st);
        table = new TableView<students>(people);

        TableColumn<students, Integer> numColumn = new TableColumn<students, Integer>("№");
        //numColumn.setCellValueFactory(new PropertyValueFactory<students, Integer>("num"));
        table.getColumns().add(numColumn);

        TableColumn<students, String> nameColumn = new TableColumn<students, String>("Имя");
        nameColumn.setCellValueFactory(new PropertyValueFactory<students, String>("name"));
        table.getColumns().add(nameColumn);

        TableColumn<students, Integer> ageColumn = new TableColumn<students, Integer>("Возраст");
        ageColumn.setCellValueFactory(new PropertyValueFactory<students, Integer>("age"));
        table.getColumns().add(ageColumn);

        TableColumn<students, String> gruppaColumn = new TableColumn<students, String>("Группа");
        gruppaColumn.setCellValueFactory(new PropertyValueFactory<students, String>("gruppa"));
        table.getColumns().add(gruppaColumn);

        TableColumn<students, Integer> kursColumn = new TableColumn<students, Integer>("Курс");
        kursColumn.setCellValueFactory(new PropertyValueFactory<students, Integer>("kurs"));
        table.getColumns().add(kursColumn);

        TableColumn<students, String> kuratorColumn = new TableColumn<students, String>("Куратор");
        kuratorColumn.setCellValueFactory(new PropertyValueFactory<students, String>("kurator"));
        table.getColumns().add(kuratorColumn);

        TableColumn<students, Double> sredniyballColumn = new TableColumn<students, Double>("Средний балл");
        sredniyballColumn.setCellValueFactory(new PropertyValueFactory<students, Double>("sredniyball"));
        table.getColumns().add(sredniyballColumn);

        nameColumn.setSortType(TableColumn.SortType.DESCENDING);
        table.setPrefWidth(740);
        table.setPrefHeight(550);

        TableView.TableViewSelectionModel<students> selectionModel = tableview.table.getSelectionModel();
        selectionModel.selectedItemProperty().addListener(new ChangeListener<students>(){

            @Override
            public void changed(ObservableValue<? extends students> observableValue, students students, students t1) {
                if(t1 != null){
                    l1.setText("Вибрано: " + t1.getName());
                    info.setOnAction(e -> control.inform(t1));
                    delete.setOnAction(e -> control.deletestudents(t1));
                }
            }
        });
    }
}
