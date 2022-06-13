import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    static ArrayList<Aluno> chamada = new ArrayList<Aluno>();

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        byte opcao;

       Externo: while(true){
            System.out.println("--------------------------------------------------------------");
            System.out.println("1 - Cadastrar aluno\n2 - Listar Alunos\n3 - Sair");
            System.out.println("--------------------------------------------------------------");
            opcao = Scan.nextByte();

            switch(opcao){
                case 1:
                    cadastrar();
                    break;

                case 2:
                    System.out.println("-------------------------Lista--------------------------------");
                    for(var a: chamada){
                        System.out.printf("Aluno: %s\n", a.getNome());
                        System.out.printf("Matricula: %s\n", a.getMatricula());
                        System.out.printf("Curso: %s\n", a.getCurso());
                        System.out.printf("Idade: %s\n", a.getIdade());
                        System.out.printf("Sexo: %s\n", a.getSexo());
                        System.out.printf("Responsavel: %s\n", a.getResponsavel());
                        System.out.println("");
                    }
                    System.out.println("-------------------------Lista--------------------------------");
                    break;

                case 3:
                    System.out.println("---------------------------------------------------------");
                    System.out.println("!ENCERRANDO PROGRAMA!");
                    System.out.println("---------------------------------------------------------");
                    break Externo;

            }
        }
    }
    static boolean cadastrar(){
        try{

            Scanner scan = new Scanner(System.in);
            Aluno referenciado = new Aluno();

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Digite o nome do aluno:");
            System.out.print("---------------------------------------------------------------------");
            referenciado.setNome(scan.nextLine());

            int aleatorio = (int) (1000 + Math.random() * 9000);
            referenciado.setMatricula(aleatorio);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Digite o curso do aluno:");
            System.out.print("---------------------------------------------------------------------");
            referenciado.setCurso(scan.nextLine());

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Digite a idade do aluno:");
            System.out.print("---------------------------------------------------------------------");
            referenciado.setIdade(scan.nextInt());
            scan.nextLine();

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Digite o sexo:");
            System.out.print("---------------------------------------------------------------------");
            String sexo = scan.nextLine();
            if(sexo.equalsIgnoreCase("MASCULINO")){
                referenciado.setSexo(Sexo.MASCULINO);
            }else if(sexo.equalsIgnoreCase("FEMININO")){
                referenciado.setSexo(Sexo.FEMININO);
            }

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Digite o nome de um dos pais:");
            System.out.print("---------------------------------------------------------------------");
            referenciado.setResponsavel(scan.nextLine());

            chamada.add(referenciado);
            return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}


