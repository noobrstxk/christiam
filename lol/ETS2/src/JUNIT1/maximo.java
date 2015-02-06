package JUNIT1;

public class maximo {
	int[] lista;
		
	public maximo(int[] lista){
			this.lista=lista;
	}
	
	public int calculamax() {
		int i, max;

			if (lista.length==0){
				return 0;
			}
			max=lista[0];
			for (i = 0; i <= lista.length - 1; i++) {
				if (lista[i] > max) {
					max = lista[i];
			}
		}
		return max;
	}	
}