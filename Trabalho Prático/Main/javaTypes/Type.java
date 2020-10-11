package javaTypes;

public abstract class Type{
	
	protected final String name;
	
	protected Type(String name){
		assert name != null: "The name can't be null";
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
    
    public boolean conformsTo(Type other) {
        return name.equals(other.getName());
    }

	@Override
	public String toString(){
		return name;
	}
	
	 public boolean isNumeric() {
      return false;
   }
   
   public boolean equalsType(Type t) {
      return name.equals(t.getName());
   }
}
