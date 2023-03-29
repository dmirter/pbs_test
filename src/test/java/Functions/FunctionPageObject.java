package Functions;

import conf.helpclass;
import org.openqa.selenium.By;
public class FunctionPageObject {
    public By clickFunctionButton = By.xpath("//nz-tree-node-title [@title='Функции']");
    public FunctionPageObject ClickFunctionButton(){
        helpclass.clickElementPresent(clickFunctionButton);
        return this;
    }
    public By clickCreateButton = By.xpath("//button[contains(text(), 'Создать функцию')]");
    public FunctionPageObject ClickCreateButton(){
        helpclass.clickElementPresent(clickCreateButton);
        return this;
    }
    public By enterName = By.xpath("//input[@name = 'name']");
    public FunctionPageObject EnterName(String Text){
        helpclass.sendElementPresent(enterName, Text);
        return this;
    }
    public FunctionPageObject FillGroup (String Labelname, String Text){
        By fillGroup = By.xpath("//label[contains(text(), '"+Labelname+"')]/following-sibling::ng-select//input");
        By enterGroup = By.xpath("//span[contains(text(), '"+Text+"')]");
        String InputGroup = Text;
        helpclass.clickElementPresent(fillGroup);
        helpclass.sendElementPresent(fillGroup, Text);
        String SelectedItem = helpclass.getTextVisible(enterGroup);
        helpclass.checkTextIdentity(InputGroup, SelectedItem);
        helpclass.clickElementVisible(enterGroup);
        return this;
    }
    public By fillDescription = By.xpath("//label[contains(text(), 'Описание')]/following-sibling::textarea");
    public FunctionPageObject FillDescription (String Text){
        helpclass.sendElementPresent(fillDescription, Text);
        return this;
    }
    public By codeEnter = By.xpath("//ace-editor");
    public By enterCode = By.xpath("//ace-editor[@id='editor']//child::textarea");
    public FunctionPageObject CodeEnter (String Text){
//        helpclass.clickElementPresent(codeEnter);
        helpclass.sendElementPresent(codeEnter, Text);
        return this;
    }

    public FunctionPageObject ChooseOutputParameter (String Labelname, String Text){
        By chooseOutputParameter = By.xpath("//label[contains(text(), '"+Labelname+"')]//following-sibling::ng-select//input");
        By enterOutputParameter = By.xpath("//span[contains(text(), '"+Text+"')]");
        String InputName = Text;
        helpclass.clickElementPresent(chooseOutputParameter);
        helpclass.sendElementPresent(chooseOutputParameter, Text);
        String SelectedItem = helpclass.getTextVisible(enterOutputParameter);
        helpclass.checkTextIdentity(InputName, SelectedItem);
        helpclass.clickElementVisible(enterOutputParameter);
        return this;
    }
}
