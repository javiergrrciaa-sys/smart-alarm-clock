package service;

import java.util.Random;

public class MathChallenge {

    private int a;
    private int b;
    private char operator;
    private int result;

    public MathChallenge() {
        generateChallenge();
    }

    /**
     * Genera una operación aleatoria
     */
    public void generateChallenge() {

        Random random = new Random();

        a = random.nextInt(20) + 1;
        b = random.nextInt(20) + 1;

        int op = random.nextInt(3);

        switch (op) {
            case 0:
                operator = '+';
                result = a + b;
                break;
            case 1:
                operator = '-';
                result = a - b;
                break;
            case 2:
                operator = '*';
                result = a * b;
                break;
        }
    }

    /**
     * Devuelve el reto en formato texto
     */
    public String getChallenge() {
        return a + " " + operator + " " + b + " = ?";
    }

    /**
     * Valida respuesta del usuario
     */
    public boolean validateAnswer(int answer) {
        return answer == result;
    }
}
