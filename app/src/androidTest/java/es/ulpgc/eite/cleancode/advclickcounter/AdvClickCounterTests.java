package es.ulpgc.eite.cleancode.advclickcounter;


import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import es.ulpgc.eite.cleancode.advclickcounter.counters.CounterListActivity;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AdvClickCounterTests { // 36 tests


    @Rule
    public ActivityTestRule<CounterListActivity> rule =
        new ActivityTestRule<>(CounterListActivity.class);

    public AdvClickCounterRobot robot = new AdvClickCounterRobot();



    public void rotateScreen() {

        Context context = ApplicationProvider.getApplicationContext();
        int orientation = context.getResources().getConfiguration().orientation;
        Activity activity = rule.getActivity();

        if(orientation  == Configuration.ORIENTATION_PORTRAIT) {
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            );

        } else {
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            );
        }

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) { }
    }


    @Test
    public void test01CrearPrimerContador() { // 1

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // When pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos lista de contadores con dimension "1"
        robot.mostramosListaDeContadoresConDimensionP1("1");
    }

    @Test
    public void test21CrearPrimerContador() { // 2

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos lista de contadores con dimension "1"
        robot.mostramosListaDeContadoresConDimensionP1("1");

    }

    @Test
    public void test02CrearSegundoContador() { // 3

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // When pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostramos lista de contadores con dimension "2"
        robot.mostramosListaDeContadoresConDimensionP1("2");
    }



    @Test
    public void test22CrearSegundoContador() { // 4

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostramos lista de contadores con dimension "2"
        robot.mostramosListaDeContadoresConDimensionP1("2");
    }

    @Test
    public void test03PulsarEnSegundoContador() { // 5

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // When pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // Then mostramos lista de clics con dimension "0"
        robot.mostramosListaDeClicsConDimensionP1("0");
    }

    @Test
    public void test23PulsarEnSegundoContador() { // 6

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos lista de clics con dimension "0"
        robot.mostramosListaDeClicsConDimensionP1("0");
    }


    @Test
    public void test04CrearPrimerClicEnSegundoContador() { // 7

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // When pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // Then mostramos clic en lista en posicion "0" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }




    @Test
    public void test24CrearPrimerClicEnSegundoContador() { // 8

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }

    @Test
    public void test05CrearSegundoClicEnSegundoContador() { // 9

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // When pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // Then mostramos clic en lista en posicion "0" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos clic en lista en posicion "1" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostramos lista de clics con dimension "2"
        robot.mostramosListaDeClicsConDimensionP1("2");
    }

    @Test
    public void test25CrearSegundoClicEnSegundoContador() { // 10

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos clic en lista en posicion "1" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostramos lista de clics con dimension "2"
        robot.mostramosListaDeClicsConDimensionP1("2");
    }


    @Test
    public void test06PulsarEnPrimerClicEnSegundoContador() { // 11

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // Then mostramos clic en lista en posicion "0" con valor "1"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos clic en lista en posicion "1" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostramos lista de clics con dimension "2"
        robot.mostramosListaDeClicsConDimensionP1("2");
    }




    @Test
    public void test26PulsarEnPrimerClicEnSegundoContador() { // 12

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "1"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos clic en lista en posicion "1" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostramos lista de clics con dimension "2"
        robot.mostramosListaDeClicsConDimensionP1("2");
    }


    @Test
    public void test07PulsarNuevamenteEnPrimerClicEnSegundoContador() { // 13

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // Then mostramos clic en lista en posicion "0" con valor "2"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
        // And mostramos clic en lista en posicion "1" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostramos lista de clics con dimension "2"
        robot.mostramosListaDeClicsConDimensionP1("2");
    }



    @Test
    public void test27PulsarNuevamenteEnPrimerClicEnSegundoContador() { // 14

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "2"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
        // And mostramos clic en lista en posicion "1" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostramos lista de clics con dimension "2"
        robot.mostramosListaDeClicsConDimensionP1("2");
    }


    @Test
    public void test08PulsarEnSegundoClicEnSegundoContador() { // 15

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // When pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // Then mostramos clic en lista en posicion "0" con valor "2"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
        // And mostramos clic en lista en posicion "1" con valor "1"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("1", "1");
        // And mostramos lista de clics con dimension "2"
        robot.mostramosListaDeClicsConDimensionP1("2");
    }




    @Test
    public void test28PulsarEnSegundoClicEnSegundoContador() { // 16

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "2"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
        // And mostramos clic en lista en posicion "1" con valor "1"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("1", "1");
        // And mostramos lista de clics con dimension "2"
        robot.mostramosListaDeClicsConDimensionP1("2");
    }



    @Test
    public void test09PulsarBackEnSegundoClicEnSegundoContador() { // 17

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // When pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "3"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3"); 
        // And mostramos lista de contadores con dimension "2"
        robot.mostramosListaDeContadoresConDimensionP1("2");
    }




    @Test
    public void test29PulsarBackEnSegundoClicEnSegundoContador() { // 18

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "3"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
        // And mostramos lista de contadores con dimension "2"
        robot.mostramosListaDeContadoresConDimensionP1("2");
    }


    @Test
    public void test10CrearTercerContador() { // 19

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // When pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "3"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
        // And mostramos contador en lista en posicion "2" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostramos lista de contadores con dimension "3"
        robot.mostramosListaDeContadoresConDimensionP1("3");
    }


    @Test
    public void test30CrearTercerContador() { // 20

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "3"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
        // And mostramos contador en lista en posicion "2" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostramos lista de contadores con dimension "3"
        robot.mostramosListaDeContadoresConDimensionP1("3");
    }


    @Test
    public void test11PulsarEnTercerContador() { // 21

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // When pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // Then mostramos lista de clics con dimension "0"
        robot.mostramosListaDeClicsConDimensionP1("0");
    }


    @Test
    public void test31PulsarEnTercerContador() { // 22

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos lista de clics con dimension "0"
        robot.mostramosListaDeClicsConDimensionP1("0");
    }


    @Test
    public void test12CrearPrimerClicEnTercerContador() { // 23

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // When pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // Then mostramos clic en lista en posicion "0" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }


    @Test
    public void test32CrearPrimerClicEnTercerContador() { // 24

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }

    @Test
    public void test13PulsarEnPrimerClicEnTercerContador() { // 25

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // Then mostramos clic en lista en posicion "0" con valor "1"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }



    @Test
    public void test33PulsarEnPrimerClicEnTercerContador() { // 26

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "1"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }

    @Test
    public void test14PulsarNuevamenteEnPrimerClicEnTercerContador() { // 27

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // Then mostramos clic en lista en posicion "0" con valor "2"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }


    @Test
    public void test34PulsarNuevamenteEnPrimerClicEnTercerContador() { // 28

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "2"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "2");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }


    @Test
    public void test15PulsarBackEnPrimerClicEnTercerContador() { // 29

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // When pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "3"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
        // And mostramos contador en lista en posicion "2" con valor "2"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "2");
        // And mostramos lista de contadores con dimension "3"
        robot.mostramosListaDeContadoresConDimensionP1("3");
    }



    @Test
    public void test35PulsarBackEnPrimerClicEnTercerContador() { // 30

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "3"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
        // And mostramos contador en lista en posicion "2" con valor "2"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "2");
        // And mostramos lista de contadores con dimension "3"
        robot.mostramosListaDeContadoresConDimensionP1("3");
    }


    @Test
    public void test16PulsarEnPrimerContador() { // 31

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // When pulsamos boton de contador en posicion "0"
        robot.pulsamosBotonDeContadorEnPosicionP1("0");
        // Then mostramos lista de clics con dimension "0"
        robot.mostramosListaDeClicsConDimensionP1("0");
    }


    @Test
    public void test36PulsarEnPrimerContador() { // 32

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de contador en posicion "0"
        robot.pulsamosBotonDeContadorEnPosicionP1("0");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos lista de clics con dimension "0"
        robot.mostramosListaDeClicsConDimensionP1("0");
    }


    @Test
    public void test17CrearPrimerClicEnPrimerContador() { // 33

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de contador en posicion "0"
        robot.pulsamosBotonDeContadorEnPosicionP1("0");
        // When pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // Then mostramos clic en lista en posicion "0" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }




    @Test
    public void test37CrearPrimerClicEnPrimerContador() { // 34

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de contador en posicion "0"
        robot.pulsamosBotonDeContadorEnPosicionP1("0");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos clic en lista en posicion "0" con valor "0"
        robot.mostramosClicEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos lista de clics con dimension "1"
        robot.mostramosListaDeClicsConDimensionP1("1");
    }


    @Test
    public void test18PulsarBackEnPrimerClicEnPrimerContador() { // 35

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de contador en posicion "0"
        robot.pulsamosBotonDeContadorEnPosicionP1("0");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // When pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "3"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
        // And mostramos contador en lista en posicion "2" con valor "2"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "2");
        // And mostramos lista de contadores con dimension "3"
        robot.mostramosListaDeContadoresConDimensionP1("3");
    }



    @Test
    public void test38PulsarBackEnPrimerClicEnPrimerContador() { // 36

        // Given mostramos lista de contadores con dimension "0"
        robot.mostramosListaDeContadoresConDimensionP1("0");
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "1"
        robot.pulsamosBotonDeContadorEnPosicionP1("1");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "1"
        robot.pulsamosBotonDeClicsEnPosicionP1("1");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de lista de contadores
        robot.pulsamosBotonDeListaDeContadores();
        // And pulsamos boton de contador en posicion "2"
        robot.pulsamosBotonDeContadorEnPosicionP1("2");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos boton de clics en posicion "0"
        robot.pulsamosBotonDeClicsEnPosicionP1("0");
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // And pulsamos boton de contador en posicion "0"
        robot.pulsamosBotonDeContadorEnPosicionP1("0");
        // And pulsamos boton de lista de clics
        robot.pulsamosBotonDeListaDeClics();
        // And pulsamos back en lista de contadores
        robot.pulsamosBackEnListaDeContadores();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos contador en lista en posicion "0" con valor "0"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostramos contador en lista en posicion "1" con valor "3"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("1", "3");
        // And mostramos contador en lista en posicion "2" con valor "2"
        robot.mostramosContadorEnListaEnPosicionP1ConValorP2("2", "2");
        // And mostramos lista de contadores con dimension "3"
        robot.mostramosListaDeContadoresConDimensionP1("3");
    }

}