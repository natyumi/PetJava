// Matheus Bueno Faria R.A.: 2052423
// Natália Yumi Marui de Camargo R.A.: 2142660

import java.util.List;
import java.util.ArrayList;

public class BancoAdocao {
    private List<Adocao> BDA = new ArrayList<Adocao>();
    private Adocao ad = new Adocao();


    public List<Adocao> getBDA(){
	return BDA;
    }

    public Adocao consultaADCOD (Adocao ad){ 
	for(int i=0; i<BDA.size(); i++){ 
            if(BDA.get(i).getCodigocachorro() == ad.getCodigocachorro()){
		return BDA.get(i);
            }
	}
	
        return null;
    }
    
    public Adocao alteraAD (Adocao ad){
        for(int i=0; i<BDA.size(); i++){

            if(BDA.get(i).getCodigocachorro() == ad.getCodigocachorro()){

		//ad = cadastroAD(ad);
		BDA.set(i, ad);
                return BDA.get(i);
            }
	}
		
	return null;

    }
    
    public Adocao excluiAD (Adocao ad){
			
	ad = consultaADCOD(ad);
	
            if(BDA.remove(ad)){
		return ad;
            }
		
	return null;

    }
}
