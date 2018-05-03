package be.vdab.adapter.kalkoenadapter;

public class Main {

	public static void main(String[] args) {
		
		
		Kalkoen wildeKalkoen = new WildeKalkoen();
		System.out.println("De kalkoen zegt:");
		//Methods van oude interface
		wildeKalkoen.klok();
		wildeKalkoen.vlieg();
		
		Eend wildeEend = new WildeEend();
		System.out.println("De eend zegt:");
		testEend(wildeEend);
		
		Eend kalkoenAdapter = new KalkoenAdapter(wildeKalkoen);
		System.out.println("De kalkoenadapter zegt:");
		//We kunnen een kalkoen doorgeven die vermomd is als een eend
		testEend(kalkoenAdapter);
		

	}
	//De nieuwe interface verwacht een eend
	public static void testEend(Eend eend) {
		eend.kwaak();
		eend.vlieg();
	}

}
