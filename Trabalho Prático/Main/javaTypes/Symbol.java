package javaTypes;

public abstract class Symbol{
	
   protected final String name;
   protected final Type type;
   protected String varName;
   protected boolean valueDefined;
	
   public Symbol(String name, Type type) {
      assert name != null;
      assert type != null;

      this.name = name;
      this.type = type;
   }
   
   public void setVarName(String varName) {
      assert varName != null;

      this.varName = varName;
   }

   public String varName(){
      return varName;
   }


   public String name(){
      return name;
   }

   
   public Type type(){
      return type;
   }
   
   public void setValueDefined(){
      valueDefined = true;
   }

   public boolean valueDefined(){
      return valueDefined;
   }
}
