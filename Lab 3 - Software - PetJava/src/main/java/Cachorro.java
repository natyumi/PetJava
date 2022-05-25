// Matheus Bueno Faria R.A.: 2052423
// Natália Yumi Marui de Camargo R.A.: 2142660

public class Cachorro {
    
    	private String nomecachorro;
	private String racacachorro; 
	private String tiposanguineocachorro; 
	private int idadecachorro; 
	private int pesocachorro; 
	private int codigocachorro;
	
	private Tutor tutor1;

	public Cachorro(){ //construtor
		String nomecachorro = "";
		String racacachorro = "";
		String tiposanguineocachorro = "";
		int idadecachorro = 0;
		int pesocachorro = 0;
		int codigocachorro = 0;
		tutor1 = new Tutor();

	}
	
	public Cachorro(String nomecachorro, String racacachorro, String tiposanguineocachorro, int idadecachorro, int pesocachorro, int codigocachorro){ //sobrecarga da classe  - 1
		this.nomecachorro = nomecachorro;
		this.racacachorro = racacachorro;
		this.tiposanguineocachorro = tiposanguineocachorro;
		this.idadecachorro = idadecachorro;
		this.pesocachorro = pesocachorro;
		this.codigocachorro = codigocachorro;
	}
		
	public Tutor getTutor1(){
		return tutor1;
	}

	public void setTutor1(Tutor tutor1){
		this.tutor1 = tutor1;
	}
	
	public void setNomecachorro(String nomecachorro){
		this.nomecachorro = nomecachorro;
	}
	
	public void setRacacachorro(String racacachorro){
		this.racacachorro = racacachorro;
	}
	
	public void setTiposanguineocachorro(String tiposanguineocachorro){
		this.tiposanguineocachorro = tiposanguineocachorro;
	}
	
	public void setIdadecachorro(int idadecachorro){
		this.idadecachorro = idadecachorro;
	}

	public void setPesocachorro (int pesocachorro){
		this.pesocachorro = pesocachorro;
	}

	public void setCodigocachorro (int codigocachorro){
		this.codigocachorro = codigocachorro;
	}

	public String getNomecachorro(){
		return nomecachorro;
	}
	
	public String getRacacachorro(){
		return racacachorro;
	}
		
	public String getTiposanguineocachorro(){
		return tiposanguineocachorro;
	}
	
	public int getIdadecachorro(){
		return idadecachorro;
	}
	
	public int getPesocachorro(){
		return pesocachorro;
	}

	public int getCodigocachorro(){
		return codigocachorro;
	}

}
