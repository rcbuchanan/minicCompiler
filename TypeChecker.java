package cs536.staticSemantics.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cs536.ast.AstVisitor;
import cs536.ast.AbstractSyntaxTree;
import static cs536.ast.AbstractSyntaxTree.*;

public class TypeChecker extends AstVisitor<Type>
{
    public boolean passed() {
        // After all, we didn't find any errors, did we? :-)
        return true;
    }



    public Type visitGlobalVarDecl(GlobalVarDecl globalVar,
                                   Type typeResult, 
                                   Type exprResult)
    {
        return null;
    }


    public Type visitAst(AbstractSyntaxTree ast,
                         List<Type> declarationResults)
    {
        return null;
    }


    public Type visitFuncDecl(FuncDecl funcDecl, 
                              Type typeResult,
                              List<Type> formalResults, 
                              List<Type> statementResults)
    {
        return null;
    }

    public Type visitFormalArg(FormalArg formalArg, Type typeResult)
    {
	return null;
    }

    public Type visitVarDeclStmt(VarDeclStmt localVar,
                                 Type typeResult, 
                                 Type initResult)
    {
	return null;
    }


    public Type visitReturnStmt(ReturnStmt retStmt, Type valResult)
    {
	return null;
    }


    public Type visitIfStmt(IfStmt ifStmt,
                            Type conditionResult,
                            List<Type> thenResults,
                            List<Type> elseResults)
    {
	return null;
    }


    public Type visitWhileStmt(WhileStmt whileStmt,
                               Type conditionResult,
                               List<Type> bodyResults)
    {
	return null;
    }


    public Type visitExpressionStmt(ExpressionStmt exprStmt,
                                    Type expResult)
    {
	return null;
    }


    public Type visitWriteStmt(WriteStmt writeStmt, Type valResult)
    {
	return null;
    }


    public Type visitReadStmt(ReadStmt readStmt)
    {
	return null;
    }


    public Type visitFunctionCallExp(FunctionCallExp fcallExp,
                                     List<Type> argResults)
    {
	// The name of the function to call is accessible through
	// fcallExp
	return null;
    }


    public Type visitDerefOp(DerefOp derefOp, Type expResult)
    {
	return null;
    }


    public Type visitNegationOp(NegationOp negationOp, Type expResult)
    {
	return null;
    }

    public Type visitIncrementOp(IncrementOp incrOp, Type expResult)
    {
	return null;
    }


    public Type visitDecrementOp(DecrementOp decrOp, Type expResult)
    {
	return null;
    }


    public Type visitNotOp(NotOp logNotOp, Type expResult)
    {
	return null;
    }


    public Type visitAddrOfOp(AddrOfOp addrOfOp, Type expResult)
    {
	return null;
    }

    public Type visitArrayAccessOp(ArrayAccessOp arrayAccessOp,
                                   Type lhsResult,
                                   Type rhsResult)
    {
	return null;
    }


    public Type visitAndOp(AndOp logAndOp,
                           Type lhsResult,
                           Type rhsResult)
    {
	return null;
    }

    public Type visitOrOp(OrOp logOrOp, Type lhsResult, Type rhsResult)
    {
	return null;
    }


    public Type visitAssignOp(AssignOp assignOp,
                              Type lhsResult,
                              Type rhsResult)
    {
	return null;
    }

    public Type visitLessThanOp(LessThanOp lessThanOp,
                                Type lhsResult,
                                Type rhsResult)
    {
	return null;
    }

    public Type visitLessOrEqualOp(LessOrEqualOp lessOrEqualOp,
                                   Type lhsResult,
                                   Type rhsResult)
    {
	return null;
    }


    public Type visitGreaterThanOp(GreaterThanOp greaterThanOp,
                                   Type lhsResult, 
                                   Type rhsResult)
    {
	return null;
    }


    public Type visitGreaterOrEqualOp(GreaterOrEqualOp greaterOrEqualOp,
                                      Type lhsResult, 
                                      Type rhsResult)
    {
	return null;
    }


    public Type visitEqualsOp(EqualsOp equalsOp, 
                              Type lhsResult, 
                              Type rhsResult)
    {
	return null;
    }


    public Type visitNotEqualsOp(NotEqualsOp notEqualsOp,
                                 Type lhsResult,
                                 Type rhsResult)
    {
	return null;
    }


    public Type visitAddOp(AddOp addOp, Type lhsResult, Type rhsResult)
    {
	return null;
    }


    public Type visitSubtractOp(SubtractOp subtractOp, 
                                Type lhsResult, 
                                Type rhsResult)
    {
	return null;
    }


    public Type visitMultiplyOp(MultiplyOp multiplyOp, 
                                Type lhsResult,
                                Type rhsResult)
    {
	return null;
    }


    public Type visitDivideOp(DivideOp divideOp, 
                              Type lhsResult, 
                              Type rhsResult)
    {
	return null;
    }


    public Type visitModOp(ModOp modOp, Type lhsResult, Type rhsResult)
    {
	return null;
    }



    public Type visitNullLit(NullLit nullLit) {
	return null;
    }

    public Type visitBooleanLit(BooleanLit booleanLit) {
	return null;
    }

    public Type visitStringLit(StringLit stringLit){
	return null;
    }

    public Type visitIntLit(IntLit intLit) {
	return null;
    }

    public Type visitDoubleLit(DoubleLit doubleLit) {
	return null;
    }

    public Type visitVarRefExp(VarRefExp varRefExp) {
	return null;
    }


    public Type visitBooleanTypeNode(BooleanTypeNode boolType) {
	return null;
    }

    public Type visitIntTypeNode(IntTypeNode intType) {
	return null;
    }

    public Type visitDoubleTypeNode(DoubleTypeNode doubleType) {
	return null;
    }

    public Type visitStringTypeNode(StringTypeNode stringType) {
	return null;
    }

    public Type visitPointerTypeNode(PointerTypeNode pointerType,
                                     Type innerResult)
    {
	return null;
    }

    public Type visitArrayTypeNode(ArrayTypeNode arrayType, Type innerResult)
    {
	return null;
    }
}
