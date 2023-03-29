package Functions;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
public class FunctionSteps {

    FunctionPageObject functionPageObject;
    public FunctionSteps(){this.functionPageObject = new FunctionPageObject();}

    @И("^нажимаем на кнопку Функции$")
    public void НажимаемНаКнопкуФункции(){
        functionPageObject.ClickFunctionButton();
        };

    @И("нажимаем на кнопку создать функцию")
    public void нажимаемНаКнопкуСоздатьФункцию() {
        functionPageObject.ClickCreateButton();
    }

    @И("заполняем имя функции: {string}")
    public void заполняемИмяФункции(String arg0) {
        functionPageObject.EnterName(arg0);
    }

    @И("выбираем группу функции: {string}, {string}")
    public void выбираемГруппуФункции(String arg0, String arg1) {
        functionPageObject.FillGroup(arg0, arg1);
    }

    @И("заполняем описание функции: {string}")
    public void заполняемОписаниеФункции(String arg0) {
        functionPageObject.FillDescription(arg0);
    }

    @И("заполняем код функции {string}")
    public void заполняемКодФункции(String arg0) {
        functionPageObject.CodeEnter(arg0);
    }

    @И("выбираем тип выходного параметра: {string}, {string}")
    public void выбираемТипВыходногоПараметра(String arg0, String arg1) {
        functionPageObject.ChooseOutputParameter(arg0, arg1);
    }

    @И("добавляем входной параметр")
    public void добавляемВходнойПараметр() {
    }

    @И("заполняем имя входного параметра: {string}")
    public void заполняемИмяВходногоПараметра(String arg0) {
    }

    @И("заполняем описание параметра: {string}")
    public void заполняемОписаниеПараметра(String arg0) {
    }

    @И("выбираем тип параметра: {string}")
    public void выбираемТипПараметра(String arg0) {
    }

    @Тогда("функция создана")
    public void функцияСоздана() {
    }

}
