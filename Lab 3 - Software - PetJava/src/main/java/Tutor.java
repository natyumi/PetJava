// Matheus Bueno Faria R.A.: 2052423
// Natália Yumi Marui de Camargo R.A.: 2142660

public class Tutor {
    	private String nometutor;
	private String enderecotutor;
	private int idadetutor;
	private String rgtutor;
	private long telefonetutor;

	public Tutor(){
		nometutor = "";
		enderecotutor = "";
		idadetutor = 0;
		rgtutor = "";
		telefonetutor = 0;
	}

	public Tutor(String nometutor, String enderecotutor, int idadetutor, String rgtutor, long tefelonetutor){ //sobrecarga da classe -1
		this.nometutor = nometutor;
		this.enderecotutor = enderecotutor;
		this.idadetutor = idadetutor;
		this.rgtutor = rgtutor;
		this.telefonetutor = telefonetutor;
	}

	public String getNometutor (){
		return nometutor;
	}

	public String getEnderecotutor (){
		return enderecotutor;
	}

	public int getIdadetutor(){
		return idadetutor;
	}

	public String getRgtutor (){
		return rgtutor;
	}

	public long getTelefonetutor(){
		return telefonetutor;
	}
	
	public void setNometutor (String nometutor){
		this.nometutor = nometutor;
	}

	public void setEnderecotutor (String enderecotutor){
		this.enderecotutor = enderecotutor;
	}

	public void setIdadetutor (int idadetutor){
		this.idadetutor = idadetutor;
	}
	
	public void setRgtutor (String rgtutor){
		this.rgtutor = rgtutor;
	}

	public void setTelefonetutor (long telefonetutor){
		this.telefonetutor = telefonetutor;
	}

}
