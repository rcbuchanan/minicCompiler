package cs536.staticSemantics.symbolTable;

public class RedeclarationException extends Exception
{
    Symbol duplicate, existing;

    public RedeclarationException(Symbol duplicate, Symbol existing)
    {
        this.duplicate = duplicate;
        this.existing = existing;
    }
    
    public String toString()
    {
        return  duplicate.getDeclarationLocation().getRow() + ":" +
                duplicate.getDeclarationLocation().getCol()  + ":" +
                duplicate.getName() +
                " was previously defined at " +
                existing.getDeclarationLocation().getRow() + ":" +
                existing.getDeclarationLocation().getCol();
    }
}
