import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainGUI {
    private Selenium selenium;
    MainGUI mainGUI;

    @BeforeEach
    public void setup() throws Exception {
             mainGUI = new MainGUI();
    }

    //First Name Testing//
    @Test
    public void TestFirstNameLable() throws Exception {
        String str = mainGUI.firstNameLable.getText();
        assertEquals("First Name", str);
    }

    @Test
    public void TestFirstName() throws Exception {
        String str = mainGUI.firstName.getText();
        assertEquals("Enter First Name", str);
    }

    //Last Name Testing//
    @Test
    public void TestLastNameLable() throws Exception {
        String str = mainGUI.lastNameLable.getText();
        assertEquals("Last Name", str);
    }

    @Test
    public void TestLastName() throws Exception {
        String str = mainGUI.lastName.getText();
        assertEquals("Enter Last Name", str);
    }

    //Address Testing//
    @Test
    public void TestAddressLable() throws Exception {
        String str = mainGUI.addressLable.getText();
        assertEquals("Address", str);
    }

    @Test
    public void TestAddress() throws Exception {
        String str = mainGUI.address.getText();
        assertEquals("Enter Address", str);
    }

    //City Testing//
    @Test
    public void TestCityLable() throws Exception {
        String str = mainGUI.cityLable.getText();
        assertEquals("City", str);
    }

    @Test
    public void TestCity() throws Exception {
        String str = mainGUI.city.getText();
        assertEquals("Enter City", str);
    }

    //Phone Number Testing//
    @Test
    public void TestPhoneNumberLable() throws Exception {
        String str = mainGUI.phoneNumberLable.getText();
        assertEquals("Phone Number", str);
    }

    @Test
    public void TestPhoneNumber() throws Exception {
        String str = mainGUI.phoneNumber.getText();
        assertEquals("Enter Phone Number", str);
    }

    //Date of Birth Testing//
    @Test
    public void TestDOBLable() throws Exception {
        String str = mainGUI.dateOfBirthLable.getText();
        assertEquals("Date of Birth", str);
    }

    @Test
    public void TestDOB() throws Exception {
        String str = mainGUI.dateOfBirth.getText();
        assertEquals("Enter Data of Birth", str);
    }

    //Not sure if this is right//
    //Test the Add Contact button
    @Test
    public void TestAddContactButton() throws Exception{
        mainGUI.addContact.addActionListener(mainGUI.addContact.getAction());
    }

    //Test the Search Contact button
    @Test
    public void TestSearchContactButton() throws Exception{
        mainGUI.searchContact.addActionListener(mainGUI.searchContact.getAction());
    }
}