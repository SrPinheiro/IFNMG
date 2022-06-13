public class Aluno {
   private String nome;
   private int matricula;
   private String curso;

   private int idade;
   private Sexo sexo;
   private String responsavel;


   public int getMatricula() {
      return matricula;
   }

   public boolean setMatricula(int matricula) {
      this.matricula = matricula;
      return true;
   }

   public String getCurso() {
      return curso;
   }

   public void setCurso(String curso) {
      this.curso = curso;
   }

   public int getIdade() {
      return idade;
   }

   public boolean setIdade(int idade) {
      if(idade > 0){
         this.idade = idade;
         return true;
      }else{
         return false;
      }
   }

   public Sexo getSexo() {
      return sexo;
   }

   public boolean setSexo(Sexo sexo) {
      this.sexo = sexo;
      return true;
   }

   public String getResponsavel() {
      return responsavel;
   }

   public boolean setResponsavel(String responsavel) {
      this.responsavel = responsavel;
      return true;
   }

   public boolean setNome(String nome){
       this.nome = nome;
       return true;
   }

   public String getNome(){
      return this.nome;
   }

   @Override
   public String toString() {
      return this.nome;
   }
}
