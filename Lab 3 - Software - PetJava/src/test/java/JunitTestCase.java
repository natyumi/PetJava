// Matheus Bueno Faria R.A.: 2052423
// Natália Yumi Marui de Camargo R.A.: 2142660

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestCase {

	/*
	@Test
	public void testaSalvarAlguem() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("Andre");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(19982420158L);
			
			if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		catch (NumberFormatException nfe) {
			fail ();
		}
	}
	
	*/
	
	/*
	@Test
	public void testaSalvarAlguem2() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("Andre");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setIdadecachorro(20);
			
			if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		catch (NumberFormatException nfe) {
			fail ();
		}
	}
	*/
	
	@Test
	public void testaSalvarAlguemCerto() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
			ad.setCodigocachorro(Integer.parseInt("12"));
			ad.setRacacachorro("Lhasa Apso");
			ad.setIdadecachorro(Integer.parseInt("11"));
			ad.setPesocachorro(Integer.parseInt("6"));
			ad.setTiposanguineocachorro("A");
			ad.setCorpelagem("branco");
			ad.setNomedoador("natalia");
			ad.setAnoadocao(Integer.parseInt("2011"));
			ad.setPortecachorro("grande");
			
			if (ad.getTutor1().getNometutor() != null && ad.getTutor1().getNometutor().length() == 0){
				fail ();
			}
			
			if (ad.getTutor1().getEnderecotutor() != null && ad.getTutor1().getEnderecotutor().length() == 0){
				fail ();
			}
			
			else if (ba.consultaADCOD(ad) == null){
				assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	
	@Test
	public void testaSalvarNomeTutorVazio() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("Lhasa Apso");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("A");
            ad.setCorpelagem("branco");
            ad.setNomedoador("natalia");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("grande");
			
			if (ad.getTutor1().getNometutor() != null && ad.getTutor1().getNometutor().length() == 0){
				fail ();
			}
			
			else if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	
	@Test
	public void testaSalvarEnderecoVazio() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("Lhasa Apso");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("A");
            ad.setCorpelagem("branco");
            ad.setNomedoador("natalia");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("grande");
			
			if (ad.getTutor1().getEnderecotutor() != null && ad.getTutor1().getEnderecotutor().length() == 0){
				fail ();
			}
			
			else if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	@Test
	public void testaSalvarNomeCachorroVazio() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("Lhasa Apso");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("A");
            ad.setCorpelagem("branco");
            ad.setNomedoador("natalia");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("grande");
			
			if (ad.getNomecachorro() != null && ad.getNomecachorro().length() == 0){
				fail ();
			}
			
			else if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	@Test
	public void testaSalvarRacaVazio() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("A");
            ad.setCorpelagem("branco");
            ad.setNomedoador("natalia");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("grande");
			
			if (ad.getRacacachorro() != null && ad.getRacacachorro().length() == 0){
				fail ();
			}
			
			else if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	@Test
	public void testaSalvarTSVazio() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("Lhasa Apso");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("");
            ad.setCorpelagem("branco");
            ad.setNomedoador("natalia");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("grande");
			
			if (ad.getTiposanguineocachorro() != null && ad.getTiposanguineocachorro().length() == 0){
				fail ();
			}
			
			else if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	@Test
	public void testaSalvarPeloVazio() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("Lhasa Apso");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("A");
            ad.setCorpelagem("");
            ad.setNomedoador("natalia");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("grande");
			
			if (ad.getCorpelagem() != null && ad.getCorpelagem().length() == 0){
				fail ();
			}
			
			else if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	@Test
	public void testaSalvarNomeDoadorVazio() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("Lhasa Apso");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("A");
            ad.setCorpelagem("branco");
            ad.setNomedoador("");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("grande");
			
			if (ad.getNomedoador() != null && ad.getNomedoador().length() == 0){
				fail ();
			}
			
			else if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	
	@Test
	public void testaPorteErrado() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("Lhasa Apso");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("A");
            ad.setCorpelagem("branco");
            ad.setNomedoador("natalia");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("abcd");
			
            if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
			
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	
	@Test
	public void testaPorteCerto() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("natalia");
			ad.getTutor1().setEnderecotutor("Rua");
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			ad.setNomecachorro("margarida");
            ad.setCodigocachorro(Integer.parseInt("12"));
            ad.setRacacachorro("Lhasa Apso");
            ad.setIdadecachorro(Integer.parseInt("11"));
            ad.setPesocachorro(Integer.parseInt("6"));
            ad.setTiposanguineocachorro("A");
            ad.setCorpelagem("branco");
            ad.setNomedoador("natalia");
            ad.setAnoadocao(Integer.parseInt("2011"));
            ad.setPortecachorro("pequeno");
			
            if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		
		catch (NumberFormatException nfe) {
			assertEquals("", nfe.getMessage());
		}
		
		catch (PorteException porte) {
			assertEquals("", porte.getMessage());
		}
	}
	/*
	@Test
	public void testaSalvarEnderecoVazio() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.getTutor1().setNometutor("André");
			ad.getTutor1().setEnderecotutor("");
			fail ();
			ad.getTutor1().setIdadetutor(20);
			ad.getTutor1().setRgtutor("56432151");
			ad.getTutor1().setTelefonetutor(1998242015L);
			
			if (ba.consultaADCOD(ad) == null){
                assertTrue(ba.getBDA().add(ad));
			}
		}
		catch (NumberFormatException nfe) {
			assertEquals("",nfe.getMessage());
		}
	}
	
	*/
	
	@Test
	public void testaCodigoExistenteERRO() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.setCodigocachorro(Integer.parseInt("12"));
			ba.getBDA().add(ad);
			
			Adocao ad2 = new Adocao ();
			ad2.setCodigocachorro(Integer.parseInt("12"));
			
			if (ba.consultaADCOD(ad2) == null){
                assertTrue(ba.getBDA().add(ad2));
			}
			
			else {
				fail ();
			}
			
		}
		catch (NumberFormatException nfe) {
			assertEquals("",nfe.getMessage());
		}
	}
	
	@Test
	public void testaCodigoExistenteCERTO() {
		try {
			
			Adocao ad = new Adocao ();
			BancoAdocao ba = new BancoAdocao();
			ad.setCodigocachorro(Integer.parseInt("12"));
			ba.getBDA().add(ad);
			
			Adocao ad2 = new Adocao ();
			ad2.setCodigocachorro(Integer.parseInt("13"));
			
			if (ba.consultaADCOD(ad2) == null){
                assertTrue(ba.getBDA().add(ad2));
			}
			
			else {
				fail ();
			}
			
		}
		catch (NumberFormatException nfe) {
			assertEquals("",nfe.getMessage());
		}
	}
	
	/*@Test
    public void testaEspaçoEmBranco() {
        Adocao ep = new Adocao ();
        assertTrue(ep.VerificarCampoVazio(""));
    }

    @Test
    public void testaNomeVálido(){
        Adocao ep = new Adocao ();
        assertTrue(ep.VerificarNomeValido("Adroaldo Gomes de Azevedo"));
    }

    @Test
    public void testaPorteCachorroVálido() throws PorteException {
        Adocao ep = new Adocao ();
        assertTrue(ep.TestePorteCachorroVálido("grande"));
    }

    @Test
    public void testaPorteCachorroInválido() throws PorteException {
        Adocao ep = new Adocao ();
        assertTrue(ep.TestePorteCachorroInválido("memes"));
        
    }
    
    */

}
