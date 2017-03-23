package zad_dodatkowe;

public class punkt_materialny {

	private int x,y,z,masa; // deklaracja atrybutow punktu materialnego, czyli
	//odleglosci od osi X,Y,Z oraz jego masa
	
	
	public punkt_materialny(){
		
	}
	public punkt_materialny(int xx, int yy, int zz, int podana_masa){//konstruktor z parametrami
		
		x=xx;
		y=yy;
		z=zz;
		masa=podana_masa;
		
	}	
	
	public int getMasa(){
		
		return masa;
	}
	
	public int getX(){
		
		return x;
	}
	public int getY(){
	
	return y;
	}
	public int getZ(){
	
	return z;
	}
	
public void setMasa(int masa1){
		
	masa=masa1;
		
	}

public void setX(int x1){
	
	x=x1;
		
	}

public void setY(int y1){
	
	y=y1;
		
	}
	
public void setZ(int z1){
	
	z=z1;
		
	}
}
