package t1;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import io.cucumber.java.ru.Когда;

@Slf4j
public class TablesSteps {
TablesPageObject tablesPageObject;

    public TablesSteps() {
    this.tablesPageObject=new TablesPageObject();
    }

    @Дано("Авторизовались в системе")
    public void авторизовалисьВСистеме() {
        tablesPageObject.OpenBasePage();
    }
        @Когда("^Открыта главная страница$")
        public void открытаглавнаястраница(){
            tablesPageObject.OpenPBS();
        }

    @И("Нажимаем на кнопку Модуль Аналитики")
    public void нажимаемНаКнопкуМодульАналитики() {
        tablesPageObject.ClickAnalButton();
    }

    @И("Нажимаем на кнопку Таблицы")
    public void нажимаемНаКнопкуТаблицы() {
        tablesPageObject.ClickTablesButton();
    }

    @И("Нажимаем на кнопку создания таблицы")
    public void нажимаемНаКнопкуСозданияТаблицы() {
        tablesPageObject.CreateTableButton();
    }

    @И("заполняем название таблицы: {string}")
    public void заполняемНазваниеТаблицы(String arg0) {
        tablesPageObject.FillTableNameField(arg0);
    }

    @И("заполняем описание таблицы: {string}")
    public void заполняемОписаниеТаблицы(String arg0) {
        tablesPageObject.FillDescriptionField(arg0);
    }

    @И("заполняем поле {string}, {string}")
    public void заполняемПоле(String arg0, String arg1) {
        tablesPageObject.FillTable(arg0, arg1, arg1);
    }

    @И("нажать на кнопку добавления колонки")
    public void нажатьНаКнопкуДобавленияКолонки() {
        tablesPageObject.AddColumnButton();
    }

    @И("заполнить название колонки: {string}")
    public void заполнитьНазваниеКолонки(String arg0) {
        tablesPageObject.EnterColumnName(arg0);
    }

    @И("заполнить значение по умолчанию {string}")
    public void заполнитьЗначениеПоУмолчанию(String arg0) {
        tablesPageObject.EnterDefaultValue(arg0);
    }
    @И("заполнить псевдоним {string}")
    public void заполнитьПсевдоним(String arg0) {
        tablesPageObject.Alias(arg0);
    }

    @И("заполняем тип данных {string}")
    public void заполняемТипДанных(String arg0) {
        tablesPageObject.DataType(arg0);
    }

    @И("заполняем длину {string}")
    public void заполняемДлину(String arg0) {
        tablesPageObject.TypeLength(arg0);
    }

    @И("нажимаем кнопку Создать")
    public void нажимаемКнопкуСоздать() {
    }

    @Тогда("Создана таблица")
    public void созданаТаблица() {
        tablesPageObject.TableCreated();
    }

    @И("нажимаем на необходимую таблицу {string}")
    public void нажимаемНаНеобходимуюТаблицу(String arg0) {
        tablesPageObject.ClickTable(arg0);
    }

    @И("нажимаем на кнопку удаления таблицы")
    public void нажимаемНаКнопкуУдаленияТаблицы() {
        tablesPageObject.DelTable();
    }

    @И("нажимаем на ОК")
    public void нажимаемНаОК() {
       tablesPageObject.ClickOk();
    }

    @Тогда("таблица удалена")
    public void таблицаУдалена() {
    }

    @И("нажимаем на кнопку Редактировать таблицу")
    public void нажимаемНаКнопкуРедактироватьТаблицу() {
    }

    @И("изменяем название таблицы {string} на {string}")
    public void изменяемНазваниеТаблицыНа(String arg0, String arg1) {
    }

    @И("нажимаем кнопку сохранения")
    public void нажимаемКнопкуСохранения() {
    }

    @Тогда("таблица изменена")
    public void таблицаИзменена() {
    }
}
