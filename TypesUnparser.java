package cs536.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static cs536.ast.AbstractSyntaxTree.*;

public class TypesUnparser extends Unparser
{
    public String visitAst(AbstractSyntaxTree ast,
                           List<String> declarationResults)
    {
        return "//Oh where, oh where should I put types in here?\n" + join(declarationResults, "");
    }
}