package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao= new DAO();
		
		String sql="INSERT INTO pessoas(nome,codigo) VALUES (?,?)";
		//vai mostrar os ID gerados
		System.out.println(dao.incluir(sql, "Ana Maria",1000));
		System.out.println(dao.incluir(sql, "Rafaela Oliveira",1001));
	    System.out.println(dao.incluir(sql, "Julia Barros",1002));
		
	    dao.close(); 
	}

}
