package BusinessObjects;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class BOSteps {

    BOPageObject boPageObject;
    public BOSteps(){this.boPageObject = new BOPageObject();}
    @И("^нажимаем на кнопку Бизнес объекты$")
    public void НажимаемНаКнопкуБизнесОбъекты() {
        boPageObject.ClickCreateButton();
    }

    @И("нажимаем на кнопку Создать конфигурацию")
    public void нажимаемНаКнопкуСоздатьКонфигурацию() {
        boPageObject.CreateConfiguration();
    }

    @И("заполняем имя бизнес-объекта: {string}")
    public void заполняемИмяБизнесОбъекта(String arg0) {
        boPageObject.FillName(arg0);
    }

    @И("заполняем описание бизнес-объекта: {string}")
    public void заполняемОписаниеБизнесОбъекта(String arg0) {
        boPageObject.FillDescription(arg0);
    }

    @И("заполняем поле: {string}, {string}")
    public void заполняемПоле(String arg0, String arg1) {
        boPageObject.FillConfGroup(arg0, arg1);
    }

    @И("выбираем состояние по умолчанию: {string}")
    public void выбираемСостояниеПоУмолчанию(String arg0) {
        boPageObject.FillConfigurState(arg0);
    }

    @И("нажимаем ОК")
    public void нажимаемОК() {
        boPageObject.ConfigurationCreated();
    }

    @Тогда("конфигурация создана")
    public void конфигурацияСоздана() {
    }

    @И("нажимаем на уже созданную конфигурацию {string}")
    public void нажимаемНаУжеСозданнуюКонфигурацию( String arg0) {
        boPageObject.CreatedConfClick(arg0);
    }

    @И("нажимаем на кнопку Удалить конфигурацию")
    public void нажимаемНаКнопкуУдалитьКонфигурацию() {
        boPageObject.ClickDelButton();
    }

    @И("нажимаем на кнопку ОК")
    public void нажимаемНаКнопкуОК() {
        boPageObject.ClickOK();
    }

    @Тогда("конфигурация БО удалена")
    public void конфигурацияБОУдалена() {
    }


    @И("нажимаем на кнопку Редактировать конфигурацию")
    public void нажимаемНаКнопкуРедактироватьКонфигурацию() {
        boPageObject.ClickEdit();
    }

    @И("нажимаем на поле {string} и изменяем название конфигурации на {string}")
    public void нажимаемНаПолеИИзменяемНазваниеКонфигурацииНа(String arg0, String arg1) {
        boPageObject.ClickNameField(arg0);
        boPageObject.ClearPaste(arg1);
    }

    @И("нажимаем Сохранить")
    public void нажимаемСохранить() {
        boPageObject.ClickOK();
    }

    @Тогда("конфигурация БО изменена")
    public void конфигурацияБОИзменена() {
    }
}
