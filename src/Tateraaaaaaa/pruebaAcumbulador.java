package Tateraaaaaaa;

import java.util.ArrayList;

class pruebaAcumbulador {

	public static void main(String[] args) throws Throwable {
		ArrayList<AcomuladorElectrico> a1=new ArrayList<AcomuladorElectrico>();//He elegido arrayList ya que me parece la mas completa, iba a usar otro tipo como Linked list pero esta se adecua mas

		Bateria b1=new Bateria("BAT01", "TESLAS", 60000, 0);
		Pila p1= new Pila("PI01", "Camara", 1000, "AA", true);
		pilaRecargable pr1=new pilaRecargable("PR01", "Juguetes", 2000, 200);
		pilaRecargable pr2=new pilaRecargable("PR21301", "Juguetes", 2000, 0);
		pr2.cargar();
		pr1.cargar();
		b1.cargar();
		addAcomulador(a1,b1);
		addAcomulador(a1, pr1,5);
		addAcomulador(a1, pr2);
		eliminaInservible(a1);
		muestraAcumuladores(a1);
		

	}

	static void addAcomulador(ArrayList<AcomuladorElectrico> f,AcomuladorElectrico a,int Cantidad) {
		for(int x=0;x<Cantidad;x++) {
			f.add(a);
		}
	}
	static void addAcomulador(ArrayList<AcomuladorElectrico> f,AcomuladorElectrico a) {
		f.add(a);
	}

	static void muestraAcumuladores(ArrayList<AcomuladorElectrico> f) {
		ArrayList<String> aray = new ArrayList<String>();
		for(AcomuladorElectrico a1:f) {

			if(aray.isEmpty()){
				aray.add(a1.getCodigo());
				System.out.println(a1.toString());
			}

			else {

				if(!aray.contains(a1.getCodigo())){
					System.out.println(a1.toString());
					aray.add(a1.getCodigo());
				}
				else {
					continue;
				}
			}
		}
	}

	static void eliminaInservible(ArrayList<AcomuladorElectrico> f) {
		for(AcomuladorElectrico a1:f) {

			if(a1 instanceof Bateria) {
				Bateria aux=(Bateria)a1;
				if(aux.getNumCiclosHechos()==aux.getNumCiclosMax()) {
					f.remove(a1);
					return;
				}
			}
			else if(a1 instanceof pilaRecargable) {
				pilaRecargable aux=(pilaRecargable)a1;
				if(aux.getNumCiclosHechos()==aux.getNumCiclosMax()) {
					f.remove(a1);
					return;
				}
			}
			else{
				if(a1.getPorcentajeCargaActual()<10) {
					f.remove(a1);
					return;


				}
			}

		}

	}
}
