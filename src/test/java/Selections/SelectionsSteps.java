package Selections;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class SelectionsSteps {
    SelectionsPageObject selectionsPageObject;
    public SelectionsSteps(){this.selectionsPageObject=new SelectionsPageObject();}
    @И("Нажимаем на кнопку Выборки")
    public void нажимаемНаКнопкуВыборки() {
        selectionsPageObject.ClickSelectionButton();
    }

    @И("нажимаем на кнопку создания выборки")
    public void нажимаемНаКнопкуСозданияВыборки() {
        selectionsPageObject.ClickSelectCreateButton();
    }

    @И("заполняем имя выборки: {string}")
    public void заполняемИмяВыборки(String arg0) {
        selectionsPageObject.FillSelectionName(arg0);
    }

    @И("заполняем описание выборки: {string}")
    public void заполняемОписаниеВыборки(String arg0) {
        selectionsPageObject.FillSelectionDescription(arg0);
    }

    @И("заполняем поля: {string}, {string}")
    public void заполняемПоля(String arg0, String arg1) {
        selectionsPageObject.FillSelectionGroup(arg0, arg1);
    }

    @И("нажимаем на выбор из таблиц")
    public void нажимаемНаВыборИзТаблиц() {
        selectionsPageObject.SelectFROM();
    }

    @И("выбираем таблицу для выборки: {string}, {string}")
    public void выбираемТаблицуДляВыборки(String arg0, String arg1) {
        selectionsPageObject.SelectTable(arg0, arg1);
    }

    @И("добавляем индекс: {string}")
    public void добавляемИндекс(String arg0) {
        selectionsPageObject.EnterAlias(arg0);
    }

    @И("нажимаем кнопку Save")
    public void нажимаемКнопкуSave() {
        selectionsPageObject.SaveSource();
    }

    @И("нажимаем на кнопку выбора")
    public void нажимаемНаКнопкуВыбора() {
        selectionsPageObject.SelectData();
    }

    @И("нажимаем выбор таблицы: {string}, {string}")
    public void нажимаемВыборТаблицы(String arg0, String arg1) {
        selectionsPageObject.SelectTableForColumns(arg0, arg1);
    }

    @И("нажимаем выбор колонки: {string}, {string}")
    public void нажимаемВыборКолонки(String arg0, String arg1) {
        selectionsPageObject.SelectColumn(arg0, arg1);
    }

    @И("добавляем индекс колонки: {string}")
    public void добавляемИндексКолонки(String arg0) {
        selectionsPageObject.EnterColumnAlias(arg0);
    }

    @И("нажимаем кнопку сохранить")
    public void нажимаемКнопкуСохранить() {
        selectionsPageObject.SaveColumn();
    }

    @И("нажимаем кнопку ОК")
    public void нажимаемКнопкуОК() {
        selectionsPageObject.SelectionCreated();
    }

    @Тогда("выборка создана")
    public void выборкаСоздана() {
    }

    @И("Нажимаем на необходимую выборку {string}")
    public void нажимаемНаНеобходимуюВыборку(String arg0) {
        selectionsPageObject.ClickSelection(arg0);
    }

    @И("нажимаем на кнопку Удалить выборку")
    public void нажимаемНаКнопкуУдалитьВыборку() {
        selectionsPageObject.DelSelection();
    }

    @И("нажимаем кнопку КОК")
    public void нажимаемКнопкуКОК() {
        selectionsPageObject.ClickOk();
    }

    @Тогда("выборка удалена")
    public void выборкаУдалена() {
    }

    @И("нажимаем кнопку Редактировать выборку")
    public void нажимаемКнопкуРедактироватьВыборку() {
        selectionsPageObject.ClickEditButton();
    }

    @И("нажимаем на поле {string} и изменяем название выборки на {string}")
    public void нажимаемНаПолеИИзменяемНазваниеВыборкиНа(String arg0, String arg1) {
        selectionsPageObject.ClickNamefield(arg0);
        selectionsPageObject.ClearpasteNamefield(arg1);
    }

    @Тогда("выборка изменена")
    public void выборкаИзменена() {
    }


}
