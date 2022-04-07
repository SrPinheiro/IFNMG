public class Variaveis {
    public static void main(String[] args) {
        // Tipo ~ nome ~ value
            //variaveis do tipo inteiro:
                //tipo primitivo = byte  classe = Byte
                //menor numero = -128  maior numero = 127
                //ocupa 1byte
                byte numeroPequeno = 127;
                System.out.println(numeroPequeno);
        
        
                //tipo = short  classe = Short
                //menor numero = -32 768 maior numero = 32 767
                //ocupa 2 bytes
                short numeroShort = 32767;
                System.out.println(numeroShort);
        
        
                //tipo = int  Classe = Integer
                // maior numero = -2 147 483 648 menor numero = 2 147 483 647
                //ocupa 4 bytes
                int numeroInteiro = 2147483647;
                System.out.println(numeroInteiro);
        
        
                //tipo = long Classe = Long
                //menor numero = -(2^63)  maior numero = 2^63
                //ocupa 8 bytes
                long numerolong = 922337203685477000l;
                System.out.println(numerolong);
        
            
            //variaveis do tipo Real
                //tipo = float   Classe = Float
                //menor numero = -(3,4.10^38) maior numero = 3,4.10^38
                //ocupa 4 bytes
                float numeroFlutuando = 2.5f;
                System.out.println(numeroFlutuando);
        
        
                //tipo = double   Classe = Double
                //menor numero = -(1,8.10^308) maior numero= 1,8.10^308
                //ocupa 8 bytes
                double numeroflutuante2 = 3.14159;
                System.out.println(numeroflutuante2);
        
        
            //variaveis do tipo caractere
                //tipo= char   Classe= Character
                //ocupa 1 byte
                char letra = 'c';
                System.out.println(letra);
        
        
                //tipo= -nao tem-  Classe= String
                //ocupa= 1Byte por letra
                String nome = "Leonardo";
                System.out.println(nome);
        
            //variaveis do tipo boolean
                //tipo= boolean   Classe= Boolean
                //ocupa= 1 bit
                boolean boleana = false; // true ou false
                System.out.println(boleana);
    }
}
