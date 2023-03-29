package BusinessObjects;

import conf.helpclass;
import org.openqa.selenium.By;

public class BOPageObject {
    public By boCreationButton = By.xpath("//nz-tree-node-title [@title='Бизнес объекты']");
    public BOPageObject ClickCreateButton(){
        helpclass.clickElementClickable(boCreationButton);
        return this;
    }
    public By createConfiguration = By.xpath("//button[contains(text(), 'Создать конфигурацию')]");
    public BOPageObject CreateConfiguration(){
        helpclass.clickElementPresent(createConfiguration);
        return this;
    }
    public By fillname = By.xpath("//input[@name='name']");
    public BOPageObject FillName(String Text){
        helpclass.sendElementPresent(fillname, Text);
        return this;
    }
    public By filldescription = By.xpath("//input[@name='description']");
    public BOPageObject FillDescription(String Text){
        helpclass.sendElementPresent(filldescription,Text);
        return this;
    }
    public BOPageObject FillConfGroup(String Labelname, String Text){
        By fillConfigurationGroup = By.xpath("//label[contains(text(), '"+Labelname+"')]/following-sibling::ng-select//input");
        By enterConfigurationGroup = By.xpath("//div[@role='option']/span[contains(text(), '"+Text+"')]");
        String InputGroup = Text;
        helpclass.clickElementPresent(fillConfigurationGroup);
        helpclass.sendElementPresent(fillConfigurationGroup, Text);
        String SelectedItem = helpclass.getTextVisible(enterConfigurationGroup);
        helpclass.checkTextIdentity(InputGroup, SelectedItem);
        helpclass.clickElementVisible(enterConfigurationGroup);
        return this;
    }
    public By configurState = By.xpath("//input[@name = 'defaultState']");
    public BOPageObject FillConfigurState(String Text){
        helpclass.sendElementPresent(configurState, Text);
        return this;
    }
    public By configurationCreated = By.xpath("//button[contains(text(), ' ОК ')]");
    public BOPageObject ConfigurationCreated(){
        helpclass.clickElementPresent(configurationCreated);
        return this;
    }
    public BOPageObject CreatedConfClick(String Labelname){
        By createdConfClick = By.xpath("//span[contains(text(), '"+Labelname+"')]");
        helpclass.clickElementPresent(createdConfClick);
        return this;
    }
    public By clickDelButton = By.xpath("//button[contains(text(), 'Удалить')]");
    public BOPageObject ClickDelButton(){
        helpclass.clickElementPresent(clickDelButton);
        return this;
    }
    public By clickOK = By.xpath("//button[contains(text(), ' ОК ')]");
    public BOPageObject ClickOK(){
        helpclass.clickElementPresent(clickOK);
        return this;
    }
    public By clickEdit = By.xpath("//button[contains(text(), 'Изменить конфигурацию')]");
    public BOPageObject ClickEdit(){
        helpclass.clickElementPresent(clickEdit);
        return this;
    }

    public BOPageObject ClickNameField(String Labelname){
        By clickNameField = By.xpath("//label[contains(text(), '"+Labelname+"')]/following-sibling::input");
        helpclass.clickElementPresent(clickNameField);
        return this;
    }
    public By clearpasteNameField = By.xpath("//label[contains(text(), 'Имя')]/following-sibling::input");
    public BOPageObject ClearPaste(String Text){
        helpclass.clearElementVisible(clearpasteNameField);
        helpclass.sendElementPresent(clearpasteNameField, Text);
        return this;
    }
}
