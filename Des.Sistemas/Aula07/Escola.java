import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    static ArrayList<Aluno> chamada = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long opcao;

        Loop:
        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("1 - Cadastrar Aluno\n2 - Listar Alunos\n3 - Localizar Aluno\n4 - Sair");
            System.out.println("-----------------------------------------------");
            opcao = scan.nextByte();

            switch ((int) opcao) {
                case 1:
                    cadastrar();
                    break;

                case 2:
                    System.out.println("--------------------Lista---------------------------");
                    for (var x : chamada) {
                        System.out.printf("Nome: %s\n", x.getNome());
                        System.out.printf("Matricula: %s\n", x.getMatricula());
                        System.out.printf("Curso: %s\n", x.getCurso());
                        System.out.printf("Idade: %s\n", x.getIdade());
                        System.out.printf("Sexo: %s\n", x.getSexo());
                        System.out.printf("Responsavel: %s\n\n", x.getResponsavel());

                    }
                    System.out.println("--------------------Lista---------------------------");
                    break;

                case 3:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Digite a matricula do aluno:");
                    System.out.println("-----------------------------------------------");
                    opcao = scan.nextLong();

                    if((opcao = localizar(opcao)) == -404){
                        System.out.println("-----------------------------------------------");
                        System.out.println("Nenhum aluno cadastrado com essa matricula!");
                        System.out.println("-----------------------------------------------");
                    }else{
                        System.out.printf("Nome: %s\n", chamada.get((int) opcao).getNome());
                        System.out.printf("Matricula: %s\n", chamada.get((int) opcao).getMatricula());
                        System.out.printf("Curso: %s\n", chamada.get((int) opcao).getCurso());
                        System.out.printf("Idade: %s\n", chamada.get((int) opcao).getIdade());
                        System.out.printf("Sexo: %s\n", chamada.get((int) opcao).getSexo());
                        System.out.printf("Responsavel: %s\n\n", chamada.get((int) opcao).getResponsavel());
                    }
                    break;


                case 4:
                    System.out.println("-----------------------------------------------");
                    System.out.println("!PROGRAMA ENCERRADO!");
                    System.out.println("-----------------------------------------------");
                    break Loop;

            }
        }
    }

    static void cadastrar(){
        //funca para cadastrar um aluno
        try{
            Scanner scan = new Scanner(System.in);
            Aluno referenciado = new Aluno();
            System.out.println("-----------------------------------------------");
            System.out.println("Digite o nome do aluno:");
            System.out.println("-----------------------------------------------");
            referenciado.setNome(scan.nextLine());

            referenciado.setMatricula((long) ( 999_999_999 + Math.random() * 999_999_999)); //gerador de matricula

            System.out.println("-----------------------------------------------");
            System.out.println("Digite o curso do aluno:");
            System.out.println("-----------------------------------------------");
            referenciado.setCurso(scan.nextLine());

            System.out.println("-----------------------------------------------");
            System.out.println("Digite a idade do aluno:");
            System.out.println("-----------------------------------------------");
            referenciado.setIdade(scan.nextInt());
            scan.nextLine();

            System.out.println("-----------------------------------------------");
            System.out.println("Digite o sexo:");
            System.out.println("-----------------------------------------------");
            String sexo = scan.nextLine();
            if(Character.toString(sexo.charAt(0)).equalsIgnoreCase("M")){
                referenciado.setSexo(Sexo.MASCULINO);

            }else if(Character.toString(sexo.charAt(0)).equalsIgnoreCase("F")){
                referenciado.setSexo(Sexo.FEMININO);
            }
            if(referenciado.getIdade() < 18){
                System.out.println("-----------------------------------------------");
                System.out.println("Digite o nome de um responsavel:");
                System.out.println("-----------------------------------------------");
                referenciado.setResponsavel(scan.nextLine());

            }else{
                referenciado.setResponsavel("*Maior De Idade*");
            }

            chamada.add(referenciado);
        }
        catch(Exception erro){
            System.out.printf("erro, o valor digitado é invalido!\nCodigo: %s\n", erro);
        }
    }

    static int localizar(Long matricula){
            //Funcao para localizar um aluno na ArrayList atraves da matricula

        int posicao = 0;

        for(var x: chamada) {
            if (x.getMatricula() == matricula) {
                return posicao;
            }
            posicao++;
        }
        return -404; // retorna o valor -404 se nao conseguir encontrar
    }
}


