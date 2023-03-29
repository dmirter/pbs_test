package Selections;

import conf.helpclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectionsPageObject {
    public By selectionsbutton = By.xpath("//nz-tree-node-title [@title='Выборки']");
    public SelectionsPageObject ClickSelectionButton(){
        helpclass.clickElementClickable(selectionsbutton);
        return this;
    }
    public By createSelection = By.xpath("//button[contains(text(), 'Создать выборку')]");
    public SelectionsPageObject ClickSelectCreateButton(){
        helpclass.clickElementClickable(createSelection);
        return this;
    }
    public By fillselectionname = By.xpath("//input[@name='name']");
    public SelectionsPageObject FillSelectionName(String Text){
        helpclass.sendElementPresent(fillselectionname, Text);
        return this;
    }
    public By fillselectiondescription = By.xpath("//input[@name='description']");
    public SelectionsPageObject FillSelectionDescription (String Text){
        helpclass.sendElementPresent(fillselectiondescription, Text);
        return this;
    }
    public SelectionsPageObject FillSelectionGroup(String Labelname, String Text){
        By fillselectiongroup = By.xpath("//label[contains(text(), '"+Labelname+"')]/following-sibling::ng-select//input");
        By chooseselectiongroup = By.xpath("//span[contains(text(), '"+Text+"')]");
        String inputText = Text;
        helpclass.clickElementPresent(fillselectiongroup);
        helpclass.sendElementPresent(fillselectiongroup, Text);
        String SelectedElement = helpclass.getTextVisible(chooseselectiongroup);
        helpclass.checkTextIdentity(inputText, SelectedElement);
        helpclass.clickElementVisible(chooseselectiongroup);
        return this;
    }
    public By selectFROM = By.xpath("//sql-source-table/div");
    public SelectionsPageObject SelectFROM (){
        helpclass.clickElementClickable(selectFROM);
        return this;
    }
    public SelectionsPageObject SelectTable(String Labelname, String Text){
        By selectTable = By.xpath("//label[contains(text(), '"+Labelname+"')]/following-sibling::ng-select//input");
        By chooseselelectionTable = By.xpath("//span[contains(text(), '"+Text+"')]");
        String inputName = Text;
        helpclass.clickElementPresent(selectTable);
        helpclass.sendElementPresent(selectTable, Text);
        String SelectedName = helpclass.getTextVisible(chooseselelectionTable);
        helpclass.checkTextIdentity(inputName, SelectedName);
        helpclass.clickElementVisible(chooseselelectionTable);
        return this;
    }
    public By enterAlias = By.xpath("//input[@formcontrolname='alias']");
    public SelectionsPageObject EnterAlias(String Text){
        helpclass.sendElementPresent(enterAlias, Text);
        return this;
    }
    public By saveSource = By.xpath("//span[contains(text(), 'Save')]");
    public SelectionsPageObject SaveSource(){
        helpclass.clickElementPresent(saveSource);
        return this;
    }
    public By selectData = By.xpath("//button[@class = 'btn-add-selection']");
    public SelectionsPageObject SelectData(){
        helpclass.clickElementPresent(selectData);
        return this;
    }
    public SelectionsPageObject SelectTableForColumns(String Labelname, String Text){
        By selectTables = By.xpath("//label[contains(text(), '"+Labelname+"')]/following-sibling::ng-select//input");
        By enterTable = By.xpath("//span[contains(text(), '"+Text+"')]");
        String InputTable = Text;
        helpclass.clickElementPresent(selectTables);
        helpclass.sendElementPresent(selectTables, Text);
        String SelectedTable = helpclass.getTextVisible(enterTable);
        helpclass.checkTextIdentity(InputTable, SelectedTable);
        helpclass.clickElementVisible(enterTable);
        return this;
    }
    public SelectionsPageObject SelectColumn(String Label, String Text){
        By selectColumn = By.xpath("//label[contains(text(), '"+Label+"')]/following-sibling::ng-select//input");
        By enterColumn = By.xpath("//span[contains(text(), '"+Text+"')]");
        String InputColumn = Text;
        helpclass.clickElementPresent(selectColumn);
        helpclass.sendElementPresent(selectColumn, Text);
        String SelectedColumn = helpclass.getTextVisible(enterColumn);
        helpclass.checkTextIdentity(InputColumn, SelectedColumn);
        helpclass.clickElementVisible(enterColumn);
        return this;
    }
    public By enterColumnAlias = By.xpath("//input[@formcontrolname='alias']");
    public SelectionsPageObject EnterColumnAlias (String Text){
        helpclass.sendElementPresent(enterColumnAlias, Text);
        return this;
    }
    public By saveColumn = By.xpath("//span[contains(text(), 'Save')]");
    public SelectionsPageObject SaveColumn(){
        helpclass.clickElementPresent(saveColumn);
        return this;
    }
    public By selectionCreated = By.xpath("//button[contains(text(), ' ОК ')]");
    public SelectionsPageObject SelectionCreated(){
        helpclass.clickElementPresent(selectionCreated);
        return this;
    }

    public SelectionsPageObject ClickSelection(String Labelname){
        By clickSelection = By.xpath("//span[contains(text(), '"+Labelname+"')]");
        helpclass.clickElementPresent(clickSelection);
        return this;
    }
    public By delSelection = By.xpath("//button[contains(text(), 'Удалить')]");
    public SelectionsPageObject DelSelection(){
        helpclass.clickElementPresent(delSelection);
        return this;
    }
    public By clickOk = By.xpath("//button[contains(text(), ' OK ')]");
    public SelectionsPageObject ClickOk(){
        helpclass.clickElementPresent(clickOk);
        return this;
    }
    public By clickEditButton = By.xpath("//button[contains(text(), 'Изменить')]");
    public SelectionsPageObject ClickEditButton(){
        helpclass.clickElementPresent(clickEditButton);
        return this;
    }
    public SelectionsPageObject ClickNamefield(String Labelname){
        By clickNamefield = By.xpath("//label[contains(text(), '"+Labelname+"')]/following-sibling::input");
        helpclass.clickElementPresent(clickNamefield);
        return this;
    }
    public By clearpasteNamefield = By.xpath("//label[contains(text(), 'Имя')]/following-sibling::input");
    public SelectionsPageObject ClearpasteNamefield(String Text){
        helpclass.clearElementVisible(clearpasteNamefield);
        helpclass.sendElementPresent(clearpasteNamefield, Text);
        return this;
    }
}
