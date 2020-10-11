package javaTypes;

public class IntegerType extends Type{
	
	public IntegerType(){
		
		super("int");
	}
	
    @Override 
    public boolean conformsTo(Type other) {
        return super.conformsTo(other) || other.getName().equals("double");
    }  

	public boolean isNumeric() {
      return true;
   }
}
