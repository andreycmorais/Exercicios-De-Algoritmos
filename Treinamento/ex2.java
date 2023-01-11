import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        String nome, sexo, estadoCivil;
        int tempo;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite seu nome");
        nome = sc.nextLine();
        System.out.println ("Digite seu sexo - F / M");
        sexo = sc.nextLine();
        System.out.println ("Digite seu estado civil - solteiro (a) - casado (a) - divorciado (a) - viúvo (a)");
        estadoCivil = sc.nextLine();
        if (sexo == "F" && estadoCivil == "casada") {
            System.out.println ("Digite quantos anos de casada");
            tempo = sc.nextInt();
        } else {
            System.out.println ("Tampa sem panela");
        }
        sc.close();
    }
}