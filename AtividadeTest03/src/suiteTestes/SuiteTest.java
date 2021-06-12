package suiteTestes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TesteClassPeso;
import teste.TesteEnergica;

@RunWith(Suite.class)
@SuiteClasses({ TesteClassPeso.class, TesteEnergica.class })
public class SuiteTest {

}
