package calculos;

public class Main {

	public static void main(String[] args) {
		
		ClassPeso cp=new ClassPeso();
		
		Energica en=new Energica();
		
		cp.classimc(cp.calculoimc(1.75, 65));
		
		
		cp.pesoideal(4, 1.20,true);
		cp.pesoideal(19, 1.60,false);
		cp.pesoideal(67, 1.69,true);
		
		en.taxametab(31, 69, false);
		en.fa(en.taxametab(31, 69, false));
		
	}

}
