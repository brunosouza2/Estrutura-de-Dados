package Aula_2;

public class Teste {
    public static void main(String[] args) throws Exception {
        var primeiroVetor = new Vetor(5);
        try {
            primeiroVetor.adiciona("Elemento1");
            primeiroVetor.adiciona("Elemento2");
            primeiroVetor.adiciona("Elemento3");
            primeiroVetor.adiciona("Elemento4");
            primeiroVetor.adiciona("Elemento5");
            primeiroVetor.adiciona("Elemento6");
            primeiroVetor.adiciona("Elemento7");
            primeiroVetor.adiciona("Elemento8");
            primeiroVetor.adiciona("Elemento9");


        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(primeiroVetor.adicionaInicio(0,"elemento 0"));
        System.out.println(primeiroVetor.tamanho());
        primeiroVetor.remove(2);
        primeiroVetor.tamanho();
        System.out.println(primeiroVetor.toString());


    }
}
