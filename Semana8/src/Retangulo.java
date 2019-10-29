
public class Retangulo implements IShape, IShow {
	
	private float base;
	private float altura;
	
	public Retangulo(float base, float altura)
	{
		setBase(base);
		setAltura(altura);
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public float getArea() {
		
		return this.base * this.altura;
	}

	@Override
	public float getPerimetro() {
		return this.base*2 + this.altura*2 ;
	}

	@Override
	public void imprimir() {
		System.out.println( "Area=" + getArea()  );

		System.out.println( "Perimetro=" + getPerimetro()  );

		
	}

}
