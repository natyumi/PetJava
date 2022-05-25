// Matheus Bueno Faria R.A.: 2052423
// Natália Yumi Marui de Camargo R.A.: 2142660

public class Adocao extends Cachorro{
        private String corpelagem;
	private String nomedoador;
	private String portecachorro;
	private int anoadocao;

	public Adocao(){ // construtor
		corpelagem = "";
		nomedoador = "";
		portecachorro = "";
		anoadocao = 0;
	}

	public Adocao(String corpelagem, String nomedoador, String portecachorro, int anoadocao){ // sobrecarga da classe - 1
		this.corpelagem = corpelagem;
		this.nomedoador = nomedoador;
		this.portecachorro = portecachorro;
		this.anoadocao = anoadocao;
	}

	public String getCorpelagem(){
		return corpelagem;
	}

	public void setCorpelagem(String corpelagem){
		this.corpelagem = corpelagem;
	}

	public String getNomedoador(){
		return nomedoador;
	}

	public void setNomedoador(String nomedoador){
		this.nomedoador = nomedoador;
	}

	public String getPortecachorro(){
		return portecachorro;
	}
        
       // public void setPortecachorro (String portecachorro){
                //this.portecachorro = portecachorro;
        //}
//Tratamento de exceção em porte do cachorro.

	public void setPortecachorro(String portecachorro) throws PorteException{
		if (portecachorro.equalsIgnoreCase("grande")){
			this.portecachorro = portecachorro;
		}
		else if(portecachorro.equalsIgnoreCase("medio")){
			this.portecachorro = portecachorro;
		}
		else if(portecachorro.equalsIgnoreCase("pequeno")){
			this.portecachorro = portecachorro;
		}
		else if(portecachorro.equalsIgnoreCase("mini")){
			this.portecachorro = portecachorro;
		}
		else if(portecachorro.equalsIgnoreCase("indefinido")){
			this.portecachorro = portecachorro;
		}
		else{
			throw new PorteException();
		}
	}

//Fim do tratamento de exceção

	public int getAnoadocao(){
		return anoadocao;
	}

	public void setAnoadocao(int anoadocao){
		this.anoadocao = anoadocao;
	}
    
}
