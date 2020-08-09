package Ultilitarios;

import org.junit.Assert;

public class Uteis {
    public static void assert_equals(String esperado, String encontrado) {
        Assert.assertEquals(
                " \n------------------------------------------------\n" +
                        " Resultado Esperado : " + esperado + "\n" +
                        " Resultado Obtido   : " + encontrado + "\n" +
                        " ------------------------------------------------" + "\n"
                , esperado, encontrado);
    }

    public static void assert_true(String esperado, String encontrado) {
        Assert.assertTrue(
                " \n------------------------------------------------\n" +
                        " O componente não contem o texto : " + esperado + "\n" +
                        " Texto do componente             : " + encontrado + "\n" +
                        " ------------------------------------------------" + "\n"
                , encontrado.contains(esperado));
    }

    public static String mensagem_validacao(String esperado, String Obtido) {
        String resposta = " \n------------------------------------------------\n" +
                " Resultado Esperado : " + esperado + "\n" +
                " Resultado Obtido   : " + Obtido + "\n" +
                " ------------------------------------------------" + "\n";

        return resposta;
    }
}
