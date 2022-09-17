public class Aluno {
   private String nome;
   private long matricula;
   private String curso;

   private int idade;
   private Sexo sexo;
   private String responsavel;


   public long getMatricula() {
      return matricula;
   }

   public void setMatricula(long matricula) {
      this.matricula = matricula;
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

   public void setIdade(int idade){
      if(idade > 0){
         this.idade = idade;
      }
   }

   public Sexo getSexo() {
      return sexo;
   }

   public void setSexo(Sexo sexo) {
      this.sexo = sexo;
   }

   public String getResponsavel() {
      return responsavel;
   }

   public void setResponsavel(String responsavel) {
      this.responsavel = responsavel;
   }

   public void setNome(String nome){
       this.nome = nome;
   }

   public String getNome(){
      return this.nome;
   }

   @Override
   public String toString() {
      return Long.toString(this.getMatricula());
   }

   @Override
   public boolean equals(Object obj) {
      if(obj instanceof Aluno aluno){
         return aluno.getMatricula() == this.getMatricula();

      }else{
         return false;
      }
   }
}
