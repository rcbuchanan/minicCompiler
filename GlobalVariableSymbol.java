package cs536.staticSemantics.symbolTable;

import cs536.staticSemantics.types.Type;
import cs536.ast.SourceLocation;

public class GlobalVariableSymbol extends VariableSymbol
{
    public GlobalVariableSymbol(String name, Type type, SourceLocation loc) {
        super(name, type, loc);
    }
}
