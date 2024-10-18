import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Dinossauro skeep = new Dinossauro();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Energia: "+skeep.energia+" Velocidade: "+skeep.velocidade
                                    +" Temperatura: "+skeep.temperatura+" Humor: "+skeep.humor);
            System.out.println("(P)ular           (C)orrer               Co(M)er\n C(A)ntar        Tomar (S)ol          Ficar na S(O)mbra");
            String textoMaiusculo = scan.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);
            if(letra == 'P'){
                skeep.pular();
            }else if(letra == 'C'){
                skeep.correr();
            }else if(letra == 'M'){
                skeep.comer();
            }
            else if(letra == 'A'){
                skeep.cantar();
            }
            else if(letra == 'S'){
                skeep.tomarSol();
            }
            else if(letra == '0'){
                skeep.ficarNaSombra();
            }
        }
    }
}
