import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    static ArrayList<Aluno> chamada = new ArrayList<Aluno>();

    public static void main(String[] args) {
        if(cadastrar()){
            System.out.println(chamada.get(0));
            System.out.println(chamada.get(0).getNome());
            System.out.println(chamada.get(0).getMatricula());
            System.out.println(chamada.get(0).getCurso());
            System.out.println(chamada.get(0).getIdade());
            System.out.println(chamada.get(0).getSexo());
            System.out.println(chamada.get(0).getResponsavel());

        }

    }
    static boolean cadastrar(){
        try{
            Scanner scan = new Scanner(System.in);
            Aluno referenciado = new Aluno();

            System.out.println("Digite o nome do aluno:");
            referenciado.setNome(scan.nextLine());

            System.out.println("Digite a matricula do aluno:");
            referenciado.setMatricula(scan.nextInt());
            scan.nextLine();

            System.out.println("Digite o curso do aluno:");
            referenciado.setCurso(scan.nextLine());

            System.out.println("Digite a idade do aluno:");
            referenciado.setIdade(scan.nextInt());
            scan.nextLine();

            System.out.println("Digite o sexo:");
            String sexo = scan.nextLine();
            if(sexo.equalsIgnoreCase("MASCULINO")){
                referenciado.setSexo(Sexo.MASCULINO);
            }else if(sexo.equalsIgnoreCase("FEMININO")){
                referenciado.setSexo(Sexo.FEMININO);
            }

            System.out.println("Digite o nome de um dos pais:");
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


