package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 24;
        String nome = "Augusto Rickes";
        double altura = 1.74;
        double peso = 80;

        double imc = (peso) / (altura * altura);

        System.out.println("Ola: " + nome);
        if (idade >= 40) {
            if (imc < 22) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " risco de subnutricao.");
            } else if (imc <= 30) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " isso ai garoto(a)");
            } else if (imc <= 35) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " opa pode estar pesado cuidado.");
            } else {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " procure um médico e um nutricionista.");
            }
        } else {
            if (imc <= 18) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " Procure um médico para avaliação de subnutrição.");
            } else if (imc <= 26) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + "Seu indice está controlado e saudável procure um nutricionista.");
            } else if (imc <= 32) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + " Parabéns consulte um médico para medição muscular e acompanhamento.");
            } else if (imc <= 40) {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + "Pré obesidade precisará de acompanhamento médico e nutricional.");
            } else {
                System.out.println("IMC: " + imc + " sua idade e " +
                        idade + "Procure um médico endocrinologista com urgência.");
            }
        }
    }
}

/*
 * (imc <= 18) "Procure um médico para avaliação de subnutrição"
 * (imc <= 26) "Seu indice está controlado e saudável procure um nutricionista."
 * (imc <= 32) "Parabéns consulte um médico para medição muscular."
 * (imc <= 40) "Pré obesidade precisará de acompanhamento nutricional."
 * (imc >= 41) "Procure um médico endocrinologista com urgência."
 */