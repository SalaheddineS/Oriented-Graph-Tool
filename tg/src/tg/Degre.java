package tg;
import java.util.Scanner;



import java.util.ArrayList;


public class Degre {
	ArrayList<Character>Sommets;
	ArrayList<String>Arcs;
	public Degre(){
		char tmp='a';
		Scanner s = new Scanner(System.in);
		Sommets=new ArrayList<>();
		Arcs=new ArrayList<>();
		while(tmp!='.') {
			System.out.println("entrer les sommets:");
			tmp=s.next().charAt(0);
			Sommets.add(tmp);
		}
		RemplirArc();
	}
	
	public void Afficher() {
		System.out.println("Vos Sommets sont : ");
		for(int i=0;i<Sommets.size();i++) {
			System.out.println(Sommets.get(i));
		}
		System.out.println("Vos Arcs sont :");
		for(int i=0;i<Arcs.size();i++) {
			System.out.println(Arcs.get(i));
		}
	}
	public void RemplirArc() {
		String tmp="";
		Arcs=new ArrayList<>();
		Scanner s = new Scanner(System.in);
		while(!tmp.equals(".")) {
			System.out.println("entrer les Arcs ");
			tmp= s.nextLine();
			Arcs.add(tmp);
		}
	}
	
	
	public void AfficherDegre() {
		System.out.print("--------------------------------- Deg + --------------------------------- \n");
		int tmp=0;
		for(int i=0;i<(Sommets.size())-1;i++) {
			System.out.print("Les degrés + de "+Sommets.get(i)+" sont: ");
			for(int y=0;y<(Arcs.size())-1;y++) {
				if(Sommets.get(i)==Arcs.get(y).charAt(0)) {
					tmp++;
					System.out.print("("+Arcs.get(y)+")");
				}}
			if(tmp==0) {
				System.out.print("Aucun ");}
				System.out.print("/ Totale => "+tmp+"\n");
				tmp=0;
			}
		tmp=0;
		System.out.print("--------------------------------- Deg - --------------------------------- \n");
		for(int i=0;i<(Sommets.size())-1;i++) {
			System.out.print("Les degrés - de "+Sommets.get(i)+" sont: ");
			for(int y=0;y<(Arcs.size())-1;y++) {
				if(Sommets.get(i)==Arcs.get(y).charAt(1)) {
					tmp++;
					System.out.print("("+Arcs.get(y)+")");
				}}
			    if(tmp==0) {System.out.print("Aucun ");}
				System.out.print("/ Totale => "+tmp+"\n");
				tmp=0;
			}
		
	}}
	


