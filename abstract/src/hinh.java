
public abstract class hinh {
     protected toado Toado;

	public hinh(toado toado) {
		super();
		Toado = toado;
	}

	public toado getToado() {
		return Toado;
	}

	public void setToado(toado toado) {
		Toado = toado;
	}
    public abstract double tinhDienTich();
}
