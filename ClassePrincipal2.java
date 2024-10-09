package lpa_Agregacao;

public class ClassePrincipal2 {

	public static void main(String[] args) {
	
		Departamento departamento = new Departamento("RH");
		
		Empresa empresa = new Empresa("3M", departamento);

		System.out.println("A empresa é: " + empresa.getNome()+ "\nDepartamento: "+ departamento.getNome());




	}
}