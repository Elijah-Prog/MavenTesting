/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.maventesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Khaya_Malusi
 */
public class ShoppingTest {
    private shopping shopping1;
    private shopping shopping2;
    private shopping shopping3;
    
    
    @Before
    public void setUp() {
        shopping1 = new shopping();
        shopping2 = new shopping();
        shopping3 = shopping1;
        
    }

 
}
