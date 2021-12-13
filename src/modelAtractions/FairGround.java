package modelAtractions;

//PROF: esto es el factorymethod de la pregunta 3
public interface FairGround {
	public String saluda();

	public default FairGround dismantle() {
		return this;
	};
}
