package t1;

import conf.helpclass;
import org.openqa.selenium.By;

import static conf.Config.*;

public class TablesPageObject {
    public  static String AuthROOT = "https://webdriver.modheader.com/add?user-roles=root&user-name=root";
//    Authorization= Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NzU1ODAyMjYsInVzZXJfbmFtZSI6ImFkbWluIiwiYXV0aG9yaXRpZXMiOlsiYWRtaW4gVVNFUlNfTU9EVUxFIiwicm9vdCBBTkFMWVRJQ19NT0RVTEUiXSwianRpIjoiOWZkMzYxOWMtZTMxMS00ZjJmLWE2OWQtOWNlODRiYzlhZDc5IiwiY2xpZW50X2lkIjoidWlfY2xpZW50Iiwic2NvcGUiOlsic2NvcGUiXX0.LbPfXpbVTJSbaRzHShNTyMzIGCOwoQweYrgiA4DBiuY5mILN7Z73N4a4dEyecxh2XWZtx4Zlxm2KDPoGdW8jTX9i1eUxdnhBm3io9Xk3zgI4Oz4dNEN2-Po3873sot-D-4a3J4Aa1EaqAcrHhhiVN0FsOvfPyiA9KBShnd65RF3II37cclmKWirrXCvbKZqlLSDIr4uzkdy8XFhPcik2Ftr6Mm5E6l_zxej7CIB2LLi5EkHpcSQ5NXuewGvtWHillNoZZoSQ6OkQ5zV7-Zwa914kwfw25i-eb0bi3eFRSYFQdWUTf41S0aGD79e4fzxEa6vJiSK98v_xIhYEK8xgrA
    public TablesPageObject OpenBasePage(){
        setDriverRequest(AuthROOT);
        return this;
    }
    public TablesPageObject OpenPBS(){
        setDriverRequest(BasePage);
        return this;
    }
    public By analbutton = By.xpath("//button[text()='Модуль Аналитики']");
    public TablesPageObject ClickAnalButton(){
        helpclass.clickElementClickable(analbutton);
        return this;
    }
    public By tablebutton = By.xpath("//nz-tree-node-title [@title='Таблицы']");
    public TablesPageObject ClickTablesButton(){
        helpclass.clickElementClickable(tablebutton);
        return this;
    }
    public By createtablebutton = By.xpath("//button[contains(text(), 'Создать таблицу')]");
    public TablesPageObject CreateTableButton(){
        helpclass.clickElementClickable(createtablebutton);
        return this;
    }
    public By filltablenamefield = By.xpath("//input [@name = 'tableName']");
    public TablesPageObject FillTableNameField(String Text){
        helpclass.sendElementPresent(filltablenamefield, Text);
        return this;
    }
    public By filldescriptionfield = By.xpath("//input[@name='description']");
    public TablesPageObject FillDescriptionField(String Text){
        helpclass.sendElementPresent(filldescriptionfield, Text);
        return this;
    }
    public By filltablegroup = By.xpath("//input[@type='text']");
    public By choosetablegroup = By.xpath("//span[@class='ng-option-label ng-star-inserted']");
    public TablesPageObject FillTableGroup (String Text){
        helpclass.sendElementPresent(filltablegroup, Text);
        helpclass.clickElementVisible(choosetablegroup);
        return this;
    }
    public TablesPageObject FillTable(String Namefield, String Text, String Element){
        By filltable = By.xpath("//label[contains(text(),'"+Namefield+"')]/following-sibling::ng-select/descendant::input");

        helpclass.sendElementPresent(filltable, Text);
        helpclass.clickElementVisible(filltable);
        By choosetabletype = By.xpath("//span[@class='ng-option-label ng-star-inserted'][contains(text(),'"+Element+"')]");
        helpclass.clickElementVisible(choosetabletype);
        return this;
    }

    public By addcolumnbutton = By.xpath("//label[contains(text(),'Колонки таблицы')]/following-sibling::button");
    public TablesPageObject AddColumnButton(){
        helpclass.clickElementClickable(addcolumnbutton);
        return this;
    }
    public By entercolumnname = By.xpath("//input[@name='name']");
    public TablesPageObject EnterColumnName(String Text){
        helpclass.sendElementPresent(entercolumnname, Text);
        return this;
    }
    public By enterdefaultvalue = By.xpath("//input[@name='defaultValue']");
    public TablesPageObject EnterDefaultValue (String Text){
        helpclass.sendElementPresent(enterdefaultvalue, Text);
        return this;
    }
    public By alias = By.xpath("//input[@name='alias']");
    public TablesPageObject Alias (String Text){
        helpclass.sendElementPresent(alias, Text);
        return this;
    }
//    public By columndescription = By.xpath("//label[contains(text(), 'Описание')]/following-sibling::input");
    public By datatype = By.xpath("//label[contains(text(), \"Тип данных\")]/following-sibling::ng-select/descendant::input");
    public TablesPageObject DataType(String Text){
        helpclass.clickElementVisible(datatype);
        By choosedatatype = By.xpath("//span[@class='ng-option-label ng-star-inserted'][contains(text(), 'VARCHAR')]");
        helpclass.clickElementVisible(choosedatatype);
        return this;
    }
    public By typelength = By.xpath("//input[@name='typeLength']");
    public TablesPageObject TypeLength(String Text){
        helpclass.sendElementClickable(typelength, Text);
        return this;
    }
    public By tableCreated = By.xpath("//button[contains(text(), 'Создать')]");
    public TablesPageObject TableCreated(){
        helpclass.clickElementPresent(tableCreated);
        return this;
    }

    public TablesPageObject ClickTable(String Labelname){
        By clickTable = By.xpath("//span[contains(text(), '"+Labelname+"')]");
        helpclass.clickElementPresent(clickTable);
        return this;
    }
    public By delTable = By.xpath("//button[contains(text(), 'Удалить')]");
    public TablesPageObject DelTable(){
        helpclass.clickElementPresent(delTable);
        return this;
    }
    public By clickOK = By.xpath("//button[contains(text(), ' OK ')]");
    public TablesPageObject ClickOk(){
        helpclass.clickElementPresent(clickOK);
        return this;
    }
}
