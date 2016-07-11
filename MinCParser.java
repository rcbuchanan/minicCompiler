// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/rc/d/536proj/src/cs536/syntax/MinC.g 2011-12-03 17:52:55

    // This section is pasted into the top of the generated
    // file.  We use it to declare a package here.  Other packages
    // can also be imported as required.
    package cs536.syntax;

    import static cs536.ast.AbstractSyntaxTree.*;
    import cs536.ast.SourceLocation;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MinCParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VOID", "LBRACKET", "RBRACKET", "STAR", "BOOL", "INT", "DOUBLE", "STRING", "IDENT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "ASSIGN", "SEMI", "RETURN", "IF", "ELSE", "WHILE", "WRITE", "READ", "NULL", "TRUE", "FALSE", "STRING_LIT", "INT_LIT", "FLOAT_LIT", "DECR", "INCR", "MINUS", "LNOT", "ADDROF", "DIV", "MOD", "PLUS", "LT", "LTE", "GT", "GTE", "EQUAL", "NEQUAL", "LAND", "LOR", "LOWER", "UPPER", "ALPHA", "DIGIT", "WHITESPACE", "LINE_COMMENT", "BLOCK_COMMENT_CONTENTS", "BLOCK_COMMENT", "UNTERM_BLOCK_COMMENT", "IDENT_START", "IDENT_CONTINUE", "BAD_IDENT", "VALID_ESCAPE_CHAR", "STRING_CHAR", "ILLEGAL_ESCAPE", "ILLEGAL_ESCAPE_STRING_CHAR", "STRING_WITH_ILLEGAL_ESCAPE", "TAB_STRING_CHAR", "STRING_WITH_TAB", "UNTERM_STRING", "INTEGER", "LEADING_ZERO_INT", "LEADING_ZERO_FLOAT"
    };
    public static final int EOF=-1;
    public static final int VOID=4;
    public static final int LBRACKET=5;
    public static final int RBRACKET=6;
    public static final int STAR=7;
    public static final int BOOL=8;
    public static final int INT=9;
    public static final int DOUBLE=10;
    public static final int STRING=11;
    public static final int IDENT=12;
    public static final int LPAREN=13;
    public static final int RPAREN=14;
    public static final int LBRACE=15;
    public static final int RBRACE=16;
    public static final int COMMA=17;
    public static final int ASSIGN=18;
    public static final int SEMI=19;
    public static final int RETURN=20;
    public static final int IF=21;
    public static final int ELSE=22;
    public static final int WHILE=23;
    public static final int WRITE=24;
    public static final int READ=25;
    public static final int NULL=26;
    public static final int TRUE=27;
    public static final int FALSE=28;
    public static final int STRING_LIT=29;
    public static final int INT_LIT=30;
    public static final int FLOAT_LIT=31;
    public static final int DECR=32;
    public static final int INCR=33;
    public static final int MINUS=34;
    public static final int LNOT=35;
    public static final int ADDROF=36;
    public static final int DIV=37;
    public static final int MOD=38;
    public static final int PLUS=39;
    public static final int LT=40;
    public static final int LTE=41;
    public static final int GT=42;
    public static final int GTE=43;
    public static final int EQUAL=44;
    public static final int NEQUAL=45;
    public static final int LAND=46;
    public static final int LOR=47;
    public static final int LOWER=48;
    public static final int UPPER=49;
    public static final int ALPHA=50;
    public static final int DIGIT=51;
    public static final int WHITESPACE=52;
    public static final int LINE_COMMENT=53;
    public static final int BLOCK_COMMENT_CONTENTS=54;
    public static final int BLOCK_COMMENT=55;
    public static final int UNTERM_BLOCK_COMMENT=56;
    public static final int IDENT_START=57;
    public static final int IDENT_CONTINUE=58;
    public static final int BAD_IDENT=59;
    public static final int VALID_ESCAPE_CHAR=60;
    public static final int STRING_CHAR=61;
    public static final int ILLEGAL_ESCAPE=62;
    public static final int ILLEGAL_ESCAPE_STRING_CHAR=63;
    public static final int STRING_WITH_ILLEGAL_ESCAPE=64;
    public static final int TAB_STRING_CHAR=65;
    public static final int STRING_WITH_TAB=66;
    public static final int UNTERM_STRING=67;
    public static final int INTEGER=68;
    public static final int LEADING_ZERO_INT=69;
    public static final int LEADING_ZERO_FLOAT=70;

    // delegates
    // delegators


        public MinCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MinCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return MinCParser.tokenNames; }
    public String getGrammarFileName() { return "/home/rc/d/536proj/src/cs536/syntax/MinC.g"; }


        // Utility function for turning a token into a source location. (These
        // will be used in future projects.) For now don't worry too much about
        // where you set your source locations; if you want to keep using your
        // code, make it "reasonable." In particular, for declarations, make it
        // the same as the thing being declared.
        private SourceLocation loc(Token tok) {
            return new SourceLocation(tok);
        }


        // Some utility functions for creating a list of one element.
        private List<Expression> makeList(Expression arg) {
            List<Expression> l = new ArrayList<Expression>();
            l.add(arg);
            return l;
        }

        private List<Statement> makeList(Statement arg) {
            List<Statement> l = new ArrayList<Statement>();
            l.add(arg);
            return l;
        }


        private List<FormalArg> makeList(FormalArg arg) {
            List<FormalArg> l = new ArrayList<FormalArg>();
            l.add(arg);
            return l;
        }


        // This overrides the function in the parser class BaseRecognizer
        // (provided by Antlr). It's called by Antlr to print the syntax
        // errors. We will hijack it so that we know there was a problem.
        public void emitErrorMessage(String msg)
        {
            super.emitErrorMessage(msg);
            encounteredError = true;
        }

        private boolean encounteredError = false;

        public boolean isSuccessful() {
            return !encounteredError;
        }



    // $ANTLR start "program"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:161:1: program returns [List<GlobalDeclaration> list] : (d= decl )* ;
    public final List<GlobalDeclaration> program() throws RecognitionException {
        List<GlobalDeclaration> list = null;

        GlobalDeclaration d = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:162:5: ( (d= decl )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:163:9: (d= decl )*
            {
             list = new ArrayList<GlobalDeclaration>(); 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:164:9: (d= decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==VOID||(LA1_0>=BOOL && LA1_0<=STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:165:13: d= decl
            	    {
            	    pushFollow(FOLLOW_decl_in_program108);
            	    d=decl();

            	    state._fsp--;

            	     list.add(d); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "program"


    // $ANTLR start "decl"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:168:1: decl returns [GlobalDeclaration node] : (g= globalVarDecl | f= funcDecl );
    public final GlobalDeclaration decl() throws RecognitionException {
        GlobalDeclaration node = null;

        GlobalVarDecl g = null;

        FuncDecl f = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:169:5: (g= globalVarDecl | f= funcDecl )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:169:7: g= globalVarDecl
                    {
                    pushFollow(FOLLOW_globalVarDecl_in_decl144);
                    g=globalVarDecl();

                    state._fsp--;

                     node = g; 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:171:7: f= funcDecl
                    {
                    pushFollow(FOLLOW_funcDecl_in_decl176);
                    f=funcDecl();

                    state._fsp--;

                     node = f; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "decl"


    // $ANTLR start "funcType"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:180:1: funcType returns [TypeNode node] : (ty= type | VOID );
    public final TypeNode funcType() throws RecognitionException {
        TypeNode node = null;

        TypeNode ty = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:181:5: (ty= type | VOID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=BOOL && LA3_0<=STRING)) ) {
                alt3=1;
            }
            else if ( (LA3_0==VOID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:181:7: ty= type
                    {
                    pushFollow(FOLLOW_type_in_funcType226);
                    ty=type();

                    state._fsp--;

                     node = ty;   

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:182:7: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_funcType242); 
                     node = null; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "funcType"


    // $ANTLR start "type"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:185:1: type returns [TypeNode node] : t= groundType ( LBRACKET len= intLit RBRACKET | STAR )* ;
    public final TypeNode type() throws RecognitionException {
        TypeNode node = null;

        TypeNode t = null;

        IntLit len = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:186:5: (t= groundType ( LBRACKET len= intLit RBRACKET | STAR )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:186:7: t= groundType ( LBRACKET len= intLit RBRACKET | STAR )*
            {
            pushFollow(FOLLOW_groundType_in_type276);
            t=groundType();

            state._fsp--;

             node = t; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:187:5: ( LBRACKET len= intLit RBRACKET | STAR )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LBRACKET) ) {
                    alt4=1;
                }
                else if ( (LA4_0==STAR) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:188:9: LBRACKET len= intLit RBRACKET
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_type294); 
            	    pushFollow(FOLLOW_intLit_in_type298);
            	    len=intLit();

            	    state._fsp--;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_type300); 
            	     node = new ArrayTypeNode(t.getLocation(), node, len.getValue()); 

            	    }
            	    break;
            	case 2 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:190:11: STAR
            	    {
            	    match(input,STAR,FOLLOW_STAR_in_type326); 
            	     node = new PointerTypeNode(t.getLocation(), node); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "type"


    // $ANTLR start "groundType"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:195:1: groundType returns [TypeNode node] : (b= BOOL | i= INT | d= DOUBLE | s= STRING );
    public final TypeNode groundType() throws RecognitionException {
        TypeNode node = null;

        Token b=null;
        Token i=null;
        Token d=null;
        Token s=null;

        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:196:5: (b= BOOL | i= INT | d= DOUBLE | s= STRING )
            int alt5=4;
            switch ( input.LA(1) ) {
            case BOOL:
                {
                alt5=1;
                }
                break;
            case INT:
                {
                alt5=2;
                }
                break;
            case DOUBLE:
                {
                alt5=3;
                }
                break;
            case STRING:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:196:7: b= BOOL
                    {
                    b=(Token)match(input,BOOL,FOLLOW_BOOL_in_groundType370); 
                     node = new BooleanTypeNode(loc(b)); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:197:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_groundType389); 
                     node = new IntTypeNode(loc(i));     

                    }
                    break;
                case 3 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:198:7: d= DOUBLE
                    {
                    d=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_groundType409); 
                     node = new DoubleTypeNode(loc(d));  

                    }
                    break;
                case 4 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:199:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_groundType426); 
                     node = new StringTypeNode(loc(s));  

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "groundType"


    // $ANTLR start "funcDecl"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:207:1: funcDecl returns [FuncDecl node] : ret= funcType name= IDENT LPAREN args= formalList RPAREN LBRACE body= stmtList RBRACE ;
    public final FuncDecl funcDecl() throws RecognitionException {
        FuncDecl node = null;

        Token name=null;
        TypeNode ret = null;

        List<FormalArg> args = null;

        List<Statement> body = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:208:5: (ret= funcType name= IDENT LPAREN args= formalList RPAREN LBRACE body= stmtList RBRACE )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:208:7: ret= funcType name= IDENT LPAREN args= formalList RPAREN LBRACE body= stmtList RBRACE
            {
            pushFollow(FOLLOW_funcType_in_funcDecl465);
            ret=funcType();

            state._fsp--;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcDecl469); 
            match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl471); 
            pushFollow(FOLLOW_formalList_in_funcDecl475);
            args=formalList();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl477); 
            match(input,LBRACE,FOLLOW_LBRACE_in_funcDecl479); 
            pushFollow(FOLLOW_stmtList_in_funcDecl483);
            body=stmtList();

            state._fsp--;

            match(input,RBRACE,FOLLOW_RBRACE_in_funcDecl485); 
             node = new FuncDecl(loc(name), ret, name.getText(), args, body); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "funcDecl"


    // $ANTLR start "formalList"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:211:1: formalList returns [List<FormalArg> al] : (e0= formalArg ( COMMA e= formalArg )* )? ;
    public final List<FormalArg> formalList() throws RecognitionException {
        List<FormalArg> al = null;

        FormalArg e0 = null;

        FormalArg e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:212:5: ( (e0= formalArg ( COMMA e= formalArg )* )? )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:213:9: (e0= formalArg ( COMMA e= formalArg )* )?
            {
             al = new ArrayList<FormalArg>(); 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:214:9: (e0= formalArg ( COMMA e= formalArg )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=BOOL && LA7_0<=STRING)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:215:15: e0= formalArg ( COMMA e= formalArg )*
                    {
                    pushFollow(FOLLOW_formalArg_in_formalList563);
                    e0=formalArg();

                    state._fsp--;

                     al.add(e0); 
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:217:13: ( COMMA e= formalArg )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:217:15: COMMA e= formalArg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalList601); 
                    	    pushFollow(FOLLOW_formalArg_in_formalList605);
                    	    e=formalArg();

                    	    state._fsp--;

                    	     al.add(e); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return al;
    }
    // $ANTLR end "formalList"


    // $ANTLR start "formalArg"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:221:1: formalArg returns [FormalArg arg] : t= type id= IDENT ;
    public final FormalArg formalArg() throws RecognitionException {
        FormalArg arg = null;

        Token id=null;
        TypeNode t = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:222:5: (t= type id= IDENT )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:222:7: t= type id= IDENT
            {
            pushFollow(FOLLOW_type_in_formalArg663);
            t=type();

            state._fsp--;

            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_formalArg667); 
             arg = new FormalArg( loc(id), t, id.getText() ); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return arg;
    }
    // $ANTLR end "formalArg"


    // $ANTLR start "globalVarDecl"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:231:1: globalVarDecl returns [GlobalVarDecl g] : (t= type i= IDENT ASSIGN e= exp SEMI | t= type i= IDENT SEMI );
    public final GlobalVarDecl globalVarDecl() throws RecognitionException {
        GlobalVarDecl g = null;

        Token i=null;
        TypeNode t = null;

        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:232:5: (t= type i= IDENT ASSIGN e= exp SEMI | t= type i= IDENT SEMI )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:232:7: t= type i= IDENT ASSIGN e= exp SEMI
                    {
                    pushFollow(FOLLOW_type_in_globalVarDecl717);
                    t=type();

                    state._fsp--;

                    i=(Token)match(input,IDENT,FOLLOW_IDENT_in_globalVarDecl721); 
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_globalVarDecl723); 
                    pushFollow(FOLLOW_exp_in_globalVarDecl727);
                    e=exp();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_globalVarDecl729); 
                     g = new GlobalVarDecl(loc(i), t, i.getText(), e); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:234:7: t= type i= IDENT SEMI
                    {
                    pushFollow(FOLLOW_type_in_globalVarDecl761);
                    t=type();

                    state._fsp--;

                    i=(Token)match(input,IDENT,FOLLOW_IDENT_in_globalVarDecl765); 
                    match(input,SEMI,FOLLOW_SEMI_in_globalVarDecl767); 
                     g = new GlobalVarDecl(loc(i), t, i.getText(), null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return g;
    }
    // $ANTLR end "globalVarDecl"


    // $ANTLR start "varDeclStmt"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:238:1: varDeclStmt returns [VarDeclStmt v] : (t= type i= IDENT ASSIGN e= exp SEMI | t= type i= IDENT SEMI );
    public final VarDeclStmt varDeclStmt() throws RecognitionException {
        VarDeclStmt v = null;

        Token i=null;
        TypeNode t = null;

        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:239:5: (t= type i= IDENT ASSIGN e= exp SEMI | t= type i= IDENT SEMI )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:239:7: t= type i= IDENT ASSIGN e= exp SEMI
                    {
                    pushFollow(FOLLOW_type_in_varDeclStmt812);
                    t=type();

                    state._fsp--;

                    i=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclStmt816); 
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclStmt818); 
                    pushFollow(FOLLOW_exp_in_varDeclStmt822);
                    e=exp();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_varDeclStmt824); 
                     v = new VarDeclStmt(loc(i), t, i.getText(), e); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:241:7: t= type i= IDENT SEMI
                    {
                    pushFollow(FOLLOW_type_in_varDeclStmt856);
                    t=type();

                    state._fsp--;

                    i=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclStmt860); 
                    match(input,SEMI,FOLLOW_SEMI_in_varDeclStmt862); 
                     v = new VarDeclStmt(loc(i), t, i.getText(), null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return v;
    }
    // $ANTLR end "varDeclStmt"


    // $ANTLR start "stmt"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:250:1: stmt returns [Statement node] : (v= varDeclStmt | r= RETURN SEMI | r= RETURN e= exp SEMI | i= IF LPAREN cond= exp RPAREN thenBody= stmtOrBody ( options {greedy=true; } : ELSE elseBody= stmtOrBody | ) | wh= WHILE LPAREN e= exp RPAREN sob= stmtOrBody | e= exp SEMI | wr= WRITE e= exp SEMI | rd= READ i= IDENT SEMI );
    public final Statement stmt() throws RecognitionException {
        Statement node = null;

        Token r=null;
        Token i=null;
        Token wh=null;
        Token wr=null;
        Token rd=null;
        VarDeclStmt v = null;

        Expression e = null;

        Expression cond = null;

        List<Statement> thenBody = null;

        List<Statement> elseBody = null;

        List<Statement> sob = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:251:5: (v= varDeclStmt | r= RETURN SEMI | r= RETURN e= exp SEMI | i= IF LPAREN cond= exp RPAREN thenBody= stmtOrBody ( options {greedy=true; } : ELSE elseBody= stmtOrBody | ) | wh= WHILE LPAREN e= exp RPAREN sob= stmtOrBody | e= exp SEMI | wr= WRITE e= exp SEMI | rd= READ i= IDENT SEMI )
            int alt11=8;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:251:7: v= varDeclStmt
                    {
                    pushFollow(FOLLOW_varDeclStmt_in_stmt912);
                    v=varDeclStmt();

                    state._fsp--;

                     node = v; 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:253:7: r= RETURN SEMI
                    {
                    r=(Token)match(input,RETURN,FOLLOW_RETURN_in_stmt944); 
                    match(input,SEMI,FOLLOW_SEMI_in_stmt946); 
                     node = new ReturnStmt(loc(r), null); 

                    }
                    break;
                case 3 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:255:7: r= RETURN e= exp SEMI
                    {
                    r=(Token)match(input,RETURN,FOLLOW_RETURN_in_stmt978); 
                    pushFollow(FOLLOW_exp_in_stmt982);
                    e=exp();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stmt984); 
                     node = new ReturnStmt(e.getLocation(), e); 

                    }
                    break;
                case 4 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:257:7: i= IF LPAREN cond= exp RPAREN thenBody= stmtOrBody ( options {greedy=true; } : ELSE elseBody= stmtOrBody | )
                    {
                    i=(Token)match(input,IF,FOLLOW_IF_in_stmt1016); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_stmt1018); 
                    pushFollow(FOLLOW_exp_in_stmt1022);
                    cond=exp();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_stmt1024); 
                    pushFollow(FOLLOW_stmtOrBody_in_stmt1028);
                    thenBody=stmtOrBody();

                    state._fsp--;

                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:258:9: ( options {greedy=true; } : ELSE elseBody= stmtOrBody | )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ELSE) ) {
                        alt10=1;
                    }
                    else if ( ((LA10_0>=STAR && LA10_0<=LPAREN)||LA10_0==RBRACE||(LA10_0>=RETURN && LA10_0<=IF)||(LA10_0>=WHILE && LA10_0<=ADDROF)) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:259:12: ELSE elseBody= stmtOrBody
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_stmt1058); 
                            pushFollow(FOLLOW_stmtOrBody_in_stmt1062);
                            elseBody=stmtOrBody();

                            state._fsp--;

                             node = new IfStmt(loc(i), cond, thenBody, elseBody); 

                            }
                            break;
                        case 2 :
                            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:261:21: 
                            {
                             node = new IfStmt(loc(i), cond, thenBody, new ArrayList<Statement>()); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:263:7: wh= WHILE LPAREN e= exp RPAREN sob= stmtOrBody
                    {
                    wh=(Token)match(input,WHILE,FOLLOW_WHILE_in_stmt1126); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_stmt1128); 
                    pushFollow(FOLLOW_exp_in_stmt1132);
                    e=exp();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_stmt1134); 
                    pushFollow(FOLLOW_stmtOrBody_in_stmt1138);
                    sob=stmtOrBody();

                    state._fsp--;

                     node = new WhileStmt(loc(wh), e, sob); 

                    }
                    break;
                case 6 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:265:7: e= exp SEMI
                    {
                    pushFollow(FOLLOW_exp_in_stmt1170);
                    e=exp();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stmt1172); 
                     node = new ExpressionStmt(e.getLocation(), e); 

                    }
                    break;
                case 7 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:267:7: wr= WRITE e= exp SEMI
                    {
                    wr=(Token)match(input,WRITE,FOLLOW_WRITE_in_stmt1204); 
                    pushFollow(FOLLOW_exp_in_stmt1208);
                    e=exp();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_stmt1210); 
                     node = new WriteStmt(e.getLocation(), e); 

                    }
                    break;
                case 8 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:269:7: rd= READ i= IDENT SEMI
                    {
                    rd=(Token)match(input,READ,FOLLOW_READ_in_stmt1242); 
                    i=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt1246); 
                    match(input,SEMI,FOLLOW_SEMI_in_stmt1248); 
                     node = new ReadStmt(loc(rd), i.getText()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "stmt"


    // $ANTLR start "stmtOrBody"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:273:1: stmtOrBody returns [List<Statement> list] : (s= stmt | LBRACE sl= stmtList RBRACE );
    public final List<Statement> stmtOrBody() throws RecognitionException {
        List<Statement> list = null;

        Statement s = null;

        List<Statement> sl = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:274:5: (s= stmt | LBRACE sl= stmtList RBRACE )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=STAR && LA12_0<=LPAREN)||(LA12_0>=RETURN && LA12_0<=IF)||(LA12_0>=WHILE && LA12_0<=ADDROF)) ) {
                alt12=1;
            }
            else if ( (LA12_0==LBRACE) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:274:7: s= stmt
                    {
                    pushFollow(FOLLOW_stmt_in_stmtOrBody1293);
                    s=stmt();

                    state._fsp--;

                     list = new ArrayList<Statement>(); list.add(s); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:275:7: LBRACE sl= stmtList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_stmtOrBody1310); 
                    pushFollow(FOLLOW_stmtList_in_stmtOrBody1314);
                    sl=stmtList();

                    state._fsp--;

                    match(input,RBRACE,FOLLOW_RBRACE_in_stmtOrBody1316); 
                     list = sl; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "stmtOrBody"


    // $ANTLR start "stmtList"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:278:1: stmtList returns [List<Statement> list] : (s= stmt )* ;
    public final List<Statement> stmtList() throws RecognitionException {
        List<Statement> list = null;

        Statement s = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:279:5: ( (s= stmt )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:279:7: (s= stmt )*
            {
             list = new ArrayList<Statement>(); 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:280:5: (s= stmt )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=STAR && LA13_0<=LPAREN)||(LA13_0>=RETURN && LA13_0<=IF)||(LA13_0>=WHILE && LA13_0<=ADDROF)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:281:9: s= stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList1376);
            	    s=stmt();

            	    state._fsp--;

            	    list.add(s);

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "stmtList"


    // $ANTLR start "literalExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:291:1: literalExp returns [LiteralExp node] : (n= nullLit | b= booleanLit | s= stringLit | i= intLit | d= doubleLit );
    public final LiteralExp literalExp() throws RecognitionException {
        LiteralExp node = null;

        NullLit n = null;

        BooleanLit b = null;

        StringLit s = null;

        IntLit i = null;

        DoubleLit d = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:292:5: (n= nullLit | b= booleanLit | s= stringLit | i= intLit | d= doubleLit )
            int alt14=5;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt14=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt14=2;
                }
                break;
            case STRING_LIT:
                {
                alt14=3;
                }
                break;
            case INT_LIT:
                {
                alt14=4;
                }
                break;
            case FLOAT_LIT:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:292:7: n= nullLit
                    {
                    pushFollow(FOLLOW_nullLit_in_literalExp1419);
                    n=nullLit();

                    state._fsp--;

                     node = n; 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:293:7: b= booleanLit
                    {
                    pushFollow(FOLLOW_booleanLit_in_literalExp1443);
                    b=booleanLit();

                    state._fsp--;

                     node = b; 

                    }
                    break;
                case 3 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:294:7: s= stringLit
                    {
                    pushFollow(FOLLOW_stringLit_in_literalExp1464);
                    s=stringLit();

                    state._fsp--;

                     node = s; 

                    }
                    break;
                case 4 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:295:7: i= intLit
                    {
                    pushFollow(FOLLOW_intLit_in_literalExp1486);
                    i=intLit();

                    state._fsp--;

                     node = i; 

                    }
                    break;
                case 5 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:296:7: d= doubleLit
                    {
                    pushFollow(FOLLOW_doubleLit_in_literalExp1511);
                    d=doubleLit();

                    state._fsp--;

                     node = d; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "literalExp"


    // $ANTLR start "nullLit"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:299:1: nullLit returns [NullLit n] : v= NULL ;
    public final NullLit nullLit() throws RecognitionException {
        NullLit n = null;

        Token v=null;

        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:299:37: (v= NULL )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:299:39: v= NULL
            {
            v=(Token)match(input,NULL,FOLLOW_NULL_in_nullLit1550); 
             n = new NullLit( loc(v) ); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "nullLit"


    // $ANTLR start "booleanLit"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:302:1: booleanLit returns [BooleanLit n] : (t= TRUE | f= FALSE );
    public final BooleanLit booleanLit() throws RecognitionException {
        BooleanLit n = null;

        Token t=null;
        Token f=null;

        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:303:5: (t= TRUE | f= FALSE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TRUE) ) {
                alt15=1;
            }
            else if ( (LA15_0==FALSE) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:303:7: t= TRUE
                    {
                    t=(Token)match(input,TRUE,FOLLOW_TRUE_in_booleanLit1578); 
                     n = new BooleanLit(loc(t), true); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:304:7: f= FALSE
                    {
                    f=(Token)match(input,FALSE,FOLLOW_FALSE_in_booleanLit1605); 
                     n = new BooleanLit(loc(f), false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "booleanLit"


    // $ANTLR start "stringLit"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:306:1: stringLit returns [StringLit n] : s= STRING_LIT ;
    public final StringLit stringLit() throws RecognitionException {
        StringLit n = null;

        Token s=null;

        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:306:37: (s= STRING_LIT )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:306:39: s= STRING_LIT
            {
            s=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_stringLit1643); 
             n = new StringLit(loc(s),  s.getText()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "stringLit"


    // $ANTLR start "intLit"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:309:1: intLit returns [IntLit n] : i= INT_LIT ;
    public final IntLit intLit() throws RecognitionException {
        IntLit n = null;

        Token i=null;

        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:309:37: (i= INT_LIT )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:309:39: i= INT_LIT
            {
            i=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_intLit1677); 

                    long value = 0;
                    boolean outofrange = false;

                    try
                        { value = Long.parseLong( i.getText() ); }
                    catch( NumberFormatException e )
                        { outofrange = true; }
                     
                    if( value>Math.max( Math.abs(Integer.MAX_VALUE), Math.abs(Integer.MIN_VALUE) ) )
                        { outofrange = true; }

                    if( outofrange )
                        { emitErrorMessage("Integer too large!"); }
                    else
                        { n = new IntLit( loc(i), value ); }
                   
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "intLit"


    // $ANTLR start "doubleLit"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:329:1: doubleLit returns [DoubleLit n] : d= FLOAT_LIT ;
    public final DoubleLit doubleLit() throws RecognitionException {
        DoubleLit n = null;

        Token d=null;

        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:329:37: (d= FLOAT_LIT )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:329:39: d= FLOAT_LIT
            {
            d=(Token)match(input,FLOAT_LIT,FOLLOW_FLOAT_LIT_in_doubleLit1718); 

                    double value = 0;
                    boolean outofrange = false;

                    try
                        { value = Double.parseDouble( d.getText() ); }
                    catch( NumberFormatException e )
                        { outofrange = true; }
                    outofrange = Double.isInfinite(value) ? true : outofrange;
                    
                    if( outofrange )
                        { emitErrorMessage("Floating point too large!"); }
                    else
                        { n = new DoubleLit( loc(d), value ); }
                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "doubleLit"


    // $ANTLR start "atomExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:367:1: atomExp returns [Expression node] : (lit= literalExp | i= IDENT | i= IDENT LPAREN al= actualsList RPAREN | LPAREN e= exp RPAREN );
    public final Expression atomExp() throws RecognitionException {
        Expression node = null;

        Token i=null;
        LiteralExp lit = null;

        List<Expression> al = null;

        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:368:5: (lit= literalExp | i= IDENT | i= IDENT LPAREN al= actualsList RPAREN | LPAREN e= exp RPAREN )
            int alt16=4;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case STRING_LIT:
            case INT_LIT:
            case FLOAT_LIT:
                {
                alt16=1;
                }
                break;
            case IDENT:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==LPAREN) ) {
                    alt16=3;
                }
                else if ( ((LA16_2>=LBRACKET && LA16_2<=STAR)||LA16_2==RPAREN||(LA16_2>=COMMA && LA16_2<=SEMI)||(LA16_2>=DECR && LA16_2<=MINUS)||(LA16_2>=DIV && LA16_2<=LOR)) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:368:7: lit= literalExp
                    {
                    pushFollow(FOLLOW_literalExp_in_atomExp1768);
                    lit=literalExp();

                    state._fsp--;

                     node = lit; 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:369:7: i= IDENT
                    {
                    i=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomExp1787); 
                     node = new VarRefExp(loc(i), i.getText()); 

                    }
                    break;
                case 3 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:370:7: i= IDENT LPAREN al= actualsList RPAREN
                    {
                    i=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomExp1813); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_atomExp1815); 
                    pushFollow(FOLLOW_actualsList_in_atomExp1819);
                    al=actualsList();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_atomExp1821); 
                     node = new FunctionCallExp(loc(i), i.getText(), al); 

                    }
                    break;
                case 4 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:372:7: LPAREN e= exp RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_atomExp1859); 
                    pushFollow(FOLLOW_exp_in_atomExp1863);
                    e=exp();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_atomExp1865); 
                     node = e; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "atomExp"


    // $ANTLR start "actualsList"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:374:1: actualsList returns [List<Expression> al] : (e0= exp ( COMMA e= exp )* )? ;
    public final List<Expression> actualsList() throws RecognitionException {
        List<Expression> al = null;

        Expression e0 = null;

        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:375:5: ( (e0= exp ( COMMA e= exp )* )? )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:376:9: (e0= exp ( COMMA e= exp )* )?
            {
             al = new ArrayList<Expression>(); 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:377:9: (e0= exp ( COMMA e= exp )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==STAR||(LA18_0>=IDENT && LA18_0<=LPAREN)||(LA18_0>=NULL && LA18_0<=ADDROF)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:378:15: e0= exp ( COMMA e= exp )*
                    {
                    pushFollow(FOLLOW_exp_in_actualsList1925);
                    e0=exp();

                    state._fsp--;

                     al.add(e0); 
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:379:13: ( COMMA e= exp )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:379:15: COMMA e= exp
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_actualsList1951); 
                    	    pushFollow(FOLLOW_exp_in_actualsList1955);
                    	    e=exp();

                    	    state._fsp--;

                    	     al.add(e); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return al;
    }
    // $ANTLR end "actualsList"


    // $ANTLR start "arrExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:385:1: arrExp returns [Expression node] : e1= atomExp ( LBRACKET e2= exp RBRACKET )* ;
    public final Expression arrExp() throws RecognitionException {
        Expression node = null;

        Expression e1 = null;

        Expression e2 = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:386:5: (e1= atomExp ( LBRACKET e2= exp RBRACKET )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:386:7: e1= atomExp ( LBRACKET e2= exp RBRACKET )*
            {
            pushFollow(FOLLOW_atomExp_in_arrExp1999);
            e1=atomExp();

            state._fsp--;

             node = e1; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:388:9: ( LBRACKET e2= exp RBRACKET )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LBRACKET) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:388:11: LBRACKET e2= exp RBRACKET
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrExp2021); 
            	    pushFollow(FOLLOW_exp_in_arrExp2025);
            	    e2=exp();

            	    state._fsp--;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrExp2027); 
            	     node = new ArrayAccessOp(e1.getLocation(), node, e2); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "arrExp"


    // $ANTLR start "postIncDecExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:392:1: postIncDecExp returns [Expression node] : e= arrExp ( DECR | INCR )* ;
    public final Expression postIncDecExp() throws RecognitionException {
        Expression node = null;

        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:393:5: (e= arrExp ( DECR | INCR )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:393:7: e= arrExp ( DECR | INCR )*
            {
            pushFollow(FOLLOW_arrExp_in_postIncDecExp2067);
            e=arrExp();

            state._fsp--;

             node = e; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:395:9: ( DECR | INCR )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DECR) ) {
                    alt20=1;
                }
                else if ( (LA20_0==INCR) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:396:13: DECR
            	    {
            	    match(input,DECR,FOLLOW_DECR_in_postIncDecExp2101); 
            	     node = new DecrementOp(e.getLocation(), node, false); 

            	    }
            	    break;
            	case 2 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:398:15: INCR
            	    {
            	    match(input,INCR,FOLLOW_INCR_in_postIncDecExp2135); 
            	     node = new IncrementOp(e.getLocation(), node, false); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "postIncDecExp"


    // $ANTLR start "preIncDecExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:404:1: preIncDecExp returns [Expression node] : ( (d= DECR e= preIncDecExp | i= INCR e= preIncDecExp ) | e= postIncDecExp );
    public final Expression preIncDecExp() throws RecognitionException {
        Expression node = null;

        Token d=null;
        Token i=null;
        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:405:5: ( (d= DECR e= preIncDecExp | i= INCR e= preIncDecExp ) | e= postIncDecExp )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=DECR && LA22_0<=INCR)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=IDENT && LA22_0<=LPAREN)||(LA22_0>=NULL && LA22_0<=FLOAT_LIT)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:406:9: (d= DECR e= preIncDecExp | i= INCR e= preIncDecExp )
                    {
                     boolean readDecr = false; 
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:407:5: (d= DECR e= preIncDecExp | i= INCR e= preIncDecExp )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==DECR) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==INCR) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:408:9: d= DECR e= preIncDecExp
                            {
                            d=(Token)match(input,DECR,FOLLOW_DECR_in_preIncDecExp2212); 
                            pushFollow(FOLLOW_preIncDecExp_in_preIncDecExp2216);
                            e=preIncDecExp();

                            state._fsp--;

                             node = new DecrementOp(e.getLocation(), e, true); 

                            }
                            break;
                        case 2 :
                            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:410:11: i= INCR e= preIncDecExp
                            {
                            i=(Token)match(input,INCR,FOLLOW_INCR_in_preIncDecExp2248); 
                            pushFollow(FOLLOW_preIncDecExp_in_preIncDecExp2252);
                            e=preIncDecExp();

                            state._fsp--;

                             node = new IncrementOp(e.getLocation(), e, true); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:413:7: e= postIncDecExp
                    {
                    pushFollow(FOLLOW_postIncDecExp_in_preIncDecExp2286);
                    e=postIncDecExp();

                    state._fsp--;

                     node = e; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "preIncDecExp"


    // $ANTLR start "minusNotExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:416:1: minusNotExp returns [Expression node] : (m= MINUS e= minusNotExp | n= LNOT e= minusNotExp | e= preIncDecExp );
    public final Expression minusNotExp() throws RecognitionException {
        Expression node = null;

        Token m=null;
        Token n=null;
        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:417:5: (m= MINUS e= minusNotExp | n= LNOT e= minusNotExp | e= preIncDecExp )
            int alt23=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                alt23=1;
                }
                break;
            case LNOT:
                {
                alt23=2;
                }
                break;
            case IDENT:
            case LPAREN:
            case NULL:
            case TRUE:
            case FALSE:
            case STRING_LIT:
            case INT_LIT:
            case FLOAT_LIT:
            case DECR:
            case INCR:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:417:7: m= MINUS e= minusNotExp
                    {
                    m=(Token)match(input,MINUS,FOLLOW_MINUS_in_minusNotExp2317); 
                    pushFollow(FOLLOW_minusNotExp_in_minusNotExp2321);
                    e=minusNotExp();

                    state._fsp--;

                     node = new NegationOp(e.getLocation(), e); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:418:7: n= LNOT e= minusNotExp
                    {
                    n=(Token)match(input,LNOT,FOLLOW_LNOT_in_minusNotExp2333); 
                    pushFollow(FOLLOW_minusNotExp_in_minusNotExp2338);
                    e=minusNotExp();

                    state._fsp--;

                     node = new NotOp(e.getLocation(), e); 

                    }
                    break;
                case 3 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:419:7: e= preIncDecExp
                    {
                    pushFollow(FOLLOW_preIncDecExp_in_minusNotExp2350);
                    e=preIncDecExp();

                    state._fsp--;

                     node = e; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "minusNotExp"


    // $ANTLR start "starExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:422:1: starExp returns [Expression node] : (s= STAR e= starExp | e= minusNotExp );
    public final Expression starExp() throws RecognitionException {
        Expression node = null;

        Token s=null;
        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:423:5: (s= STAR e= starExp | e= minusNotExp )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==STAR) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=IDENT && LA24_0<=LPAREN)||(LA24_0>=NULL && LA24_0<=LNOT)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:423:7: s= STAR e= starExp
                    {
                    s=(Token)match(input,STAR,FOLLOW_STAR_in_starExp2382); 
                    pushFollow(FOLLOW_starExp_in_starExp2386);
                    e=starExp();

                    state._fsp--;

                     node = new DerefOp(e.getLocation(), e); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:424:7: e= minusNotExp
                    {
                    pushFollow(FOLLOW_minusNotExp_in_starExp2403);
                    e=minusNotExp();

                    state._fsp--;

                     node = e; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "starExp"


    // $ANTLR start "addrExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:427:1: addrExp returns [Expression node] : (s= ADDROF e= addrExp | m= starExp );
    public final Expression addrExp() throws RecognitionException {
        Expression node = null;

        Token s=null;
        Expression e = null;

        Expression m = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:428:5: (s= ADDROF e= addrExp | m= starExp )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ADDROF) ) {
                alt25=1;
            }
            else if ( (LA25_0==STAR||(LA25_0>=IDENT && LA25_0<=LPAREN)||(LA25_0>=NULL && LA25_0<=LNOT)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:428:7: s= ADDROF e= addrExp
                    {
                    s=(Token)match(input,ADDROF,FOLLOW_ADDROF_in_addrExp2436); 
                    pushFollow(FOLLOW_addrExp_in_addrExp2440);
                    e=addrExp();

                    state._fsp--;

                     node = new AddrOfOp(e.getLocation(), e); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:430:7: m= starExp
                    {
                    pushFollow(FOLLOW_starExp_in_addrExp2480);
                    m=starExp();

                    state._fsp--;

                     node = m; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "addrExp"


    // $ANTLR start "timesDivModExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:434:1: timesDivModExp returns [Expression node] : e= addrExp (p= STAR r= addrExp | m= DIV r= addrExp | m= MOD r= addrExp )* ;
    public final Expression timesDivModExp() throws RecognitionException {
        Expression node = null;

        Token p=null;
        Token m=null;
        Expression e = null;

        Expression r = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:435:5: (e= addrExp (p= STAR r= addrExp | m= DIV r= addrExp | m= MOD r= addrExp )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:435:7: e= addrExp (p= STAR r= addrExp | m= DIV r= addrExp | m= MOD r= addrExp )*
            {
            pushFollow(FOLLOW_addrExp_in_timesDivModExp2518);
            e=addrExp();

            state._fsp--;

             node = e; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:436:5: (p= STAR r= addrExp | m= DIV r= addrExp | m= MOD r= addrExp )*
            loop26:
            do {
                int alt26=4;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt26=1;
                    }
                    break;
                case DIV:
                    {
                    alt26=2;
                    }
                    break;
                case MOD:
                    {
                    alt26=3;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:437:9: p= STAR r= addrExp
            	    {
            	    p=(Token)match(input,STAR,FOLLOW_STAR_in_timesDivModExp2550); 
            	    pushFollow(FOLLOW_addrExp_in_timesDivModExp2554);
            	    r=addrExp();

            	    state._fsp--;

            	     node = new MultiplyOp(node.getLocation(), node, r); 

            	    }
            	    break;
            	case 2 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:439:11: m= DIV r= addrExp
            	    {
            	    m=(Token)match(input,DIV,FOLLOW_DIV_in_timesDivModExp2598); 
            	    pushFollow(FOLLOW_addrExp_in_timesDivModExp2602);
            	    r=addrExp();

            	    state._fsp--;

            	     node = new DivideOp(node.getLocation(), node, r); 

            	    }
            	    break;
            	case 3 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:441:11: m= MOD r= addrExp
            	    {
            	    m=(Token)match(input,MOD,FOLLOW_MOD_in_timesDivModExp2646); 
            	    pushFollow(FOLLOW_addrExp_in_timesDivModExp2650);
            	    r=addrExp();

            	    state._fsp--;

            	     node = new ModOp(node.getLocation(), node, r); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "timesDivModExp"


    // $ANTLR start "addSubExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:447:1: addSubExp returns [Expression node] : e= timesDivModExp (p= PLUS r= timesDivModExp | m= MINUS r= timesDivModExp )* ;
    public final Expression addSubExp() throws RecognitionException {
        Expression node = null;

        Token p=null;
        Token m=null;
        Expression e = null;

        Expression r = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:448:5: (e= timesDivModExp (p= PLUS r= timesDivModExp | m= MINUS r= timesDivModExp )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:448:7: e= timesDivModExp (p= PLUS r= timesDivModExp | m= MINUS r= timesDivModExp )*
            {
            pushFollow(FOLLOW_timesDivModExp_in_addSubExp2711);
            e=timesDivModExp();

            state._fsp--;

             node = e; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:449:5: (p= PLUS r= timesDivModExp | m= MINUS r= timesDivModExp )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==PLUS) ) {
                    alt27=1;
                }
                else if ( (LA27_0==MINUS) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:450:9: p= PLUS r= timesDivModExp
            	    {
            	    p=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSubExp2736); 
            	    pushFollow(FOLLOW_timesDivModExp_in_addSubExp2740);
            	    r=timesDivModExp();

            	    state._fsp--;

            	     node = new AddOp(node.getLocation(), node, r); 

            	    }
            	    break;
            	case 2 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:452:11: m= MINUS r= timesDivModExp
            	    {
            	    m=(Token)match(input,MINUS,FOLLOW_MINUS_in_addSubExp2784); 
            	    pushFollow(FOLLOW_timesDivModExp_in_addSubExp2788);
            	    r=timesDivModExp();

            	    state._fsp--;

            	     node = new SubtractOp(node.getLocation(), node, r); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "addSubExp"


    // $ANTLR start "ltGtExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:457:1: ltGtExp returns [Expression node] : e= addSubExp (s= LT e2= addSubExp | s= LTE e2= addSubExp | s= GT e2= addSubExp | s= GTE e2= addSubExp )? ;
    public final Expression ltGtExp() throws RecognitionException {
        Expression node = null;

        Token s=null;
        Expression e = null;

        Expression e2 = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:458:5: (e= addSubExp (s= LT e2= addSubExp | s= LTE e2= addSubExp | s= GT e2= addSubExp | s= GTE e2= addSubExp )? )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:458:7: e= addSubExp (s= LT e2= addSubExp | s= LTE e2= addSubExp | s= GT e2= addSubExp | s= GTE e2= addSubExp )?
            {
            pushFollow(FOLLOW_addSubExp_in_ltGtExp2848);
            e=addSubExp();

            state._fsp--;

             node = e; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:459:5: (s= LT e2= addSubExp | s= LTE e2= addSubExp | s= GT e2= addSubExp | s= GTE e2= addSubExp )?
            int alt28=5;
            switch ( input.LA(1) ) {
                case LT:
                    {
                    alt28=1;
                    }
                    break;
                case LTE:
                    {
                    alt28=2;
                    }
                    break;
                case GT:
                    {
                    alt28=3;
                    }
                    break;
                case GTE:
                    {
                    alt28=4;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:460:9: s= LT e2= addSubExp
                    {
                    s=(Token)match(input,LT,FOLLOW_LT_in_ltGtExp2878); 
                    pushFollow(FOLLOW_addSubExp_in_ltGtExp2882);
                    e2=addSubExp();

                    state._fsp--;

                     node = new LessThanOp(loc(s), node, e2); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:461:11: s= LTE e2= addSubExp
                    {
                    s=(Token)match(input,LTE,FOLLOW_LTE_in_ltGtExp2901); 
                    pushFollow(FOLLOW_addSubExp_in_ltGtExp2905);
                    e2=addSubExp();

                    state._fsp--;

                     node = new LessOrEqualOp(loc(s), node, e2); 

                    }
                    break;
                case 3 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:462:11: s= GT e2= addSubExp
                    {
                    s=(Token)match(input,GT,FOLLOW_GT_in_ltGtExp2921); 
                    pushFollow(FOLLOW_addSubExp_in_ltGtExp2925);
                    e2=addSubExp();

                    state._fsp--;

                     node = new GreaterThanOp(loc(s), node, e2); 

                    }
                    break;
                case 4 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:463:11: s= GTE e2= addSubExp
                    {
                    s=(Token)match(input,GTE,FOLLOW_GTE_in_ltGtExp2942); 
                    pushFollow(FOLLOW_addSubExp_in_ltGtExp2946);
                    e2=addSubExp();

                    state._fsp--;

                     node = new GreaterOrEqualOp(loc(s), node, e2); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "ltGtExp"


    // $ANTLR start "eqExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:467:1: eqExp returns [Expression node] : e= ltGtExp (s= EQUAL e2= ltGtExp | s= NEQUAL e2= ltGtExp )* ;
    public final Expression eqExp() throws RecognitionException {
        Expression node = null;

        Token s=null;
        Expression e = null;

        Expression e2 = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:468:5: (e= ltGtExp (s= EQUAL e2= ltGtExp | s= NEQUAL e2= ltGtExp )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:468:7: e= ltGtExp (s= EQUAL e2= ltGtExp | s= NEQUAL e2= ltGtExp )*
            {
            pushFollow(FOLLOW_ltGtExp_in_eqExp2978);
            e=ltGtExp();

            state._fsp--;

             node = e; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:469:5: (s= EQUAL e2= ltGtExp | s= NEQUAL e2= ltGtExp )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==EQUAL) ) {
                    alt29=1;
                }
                else if ( (LA29_0==NEQUAL) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:470:13: s= EQUAL e2= ltGtExp
            	    {
            	    s=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_eqExp3014); 
            	    pushFollow(FOLLOW_ltGtExp_in_eqExp3018);
            	    e2=ltGtExp();

            	    state._fsp--;

            	     node = new EqualsOp(loc(s), node, e2); 

            	    }
            	    break;
            	case 2 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:472:15: s= NEQUAL e2= ltGtExp
            	    {
            	    s=(Token)match(input,NEQUAL,FOLLOW_NEQUAL_in_eqExp3066); 
            	    pushFollow(FOLLOW_ltGtExp_in_eqExp3070);
            	    e2=ltGtExp();

            	    state._fsp--;

            	     node = new NotEqualsOp(loc(s), node, e2); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "eqExp"


    // $ANTLR start "andExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:477:1: andExp returns [Expression node] : e= eqExp (s= LAND e2= eqExp )* ;
    public final Expression andExp() throws RecognitionException {
        Expression node = null;

        Token s=null;
        Expression e = null;

        Expression e2 = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:478:5: (e= eqExp (s= LAND e2= eqExp )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:478:7: e= eqExp (s= LAND e2= eqExp )*
            {
            pushFollow(FOLLOW_eqExp_in_andExp3130);
            e=eqExp();

            state._fsp--;

             node = e; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:479:5: (s= LAND e2= eqExp )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==LAND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:480:13: s= LAND e2= eqExp
            	    {
            	    s=(Token)match(input,LAND,FOLLOW_LAND_in_andExp3168); 
            	    pushFollow(FOLLOW_eqExp_in_andExp3172);
            	    e2=eqExp();

            	    state._fsp--;

            	     node = new AndOp(loc(s), node, e2); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "andExp"


    // $ANTLR start "orExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:484:1: orExp returns [Expression node] : e= andExp (s= LOR e2= andExp )* ;
    public final Expression orExp() throws RecognitionException {
        Expression node = null;

        Token s=null;
        Expression e = null;

        Expression e2 = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:485:5: (e= andExp (s= LOR e2= andExp )* )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:485:7: e= andExp (s= LOR e2= andExp )*
            {
            pushFollow(FOLLOW_andExp_in_orExp3205);
            e=andExp();

            state._fsp--;

             node = e; 
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:486:5: (s= LOR e2= andExp )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==LOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:487:13: s= LOR e2= andExp
            	    {
            	    s=(Token)match(input,LOR,FOLLOW_LOR_in_orExp3242); 
            	    pushFollow(FOLLOW_andExp_in_orExp3246);
            	    e2=andExp();

            	    state._fsp--;

            	     node = new OrOp(loc(s), node, e2); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "orExp"


    // $ANTLR start "assignExp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:491:1: assignExp returns [Expression node] : oe= orExp ae= assignExp2 ;
    public final Expression assignExp() throws RecognitionException {
        Expression node = null;

        Expression oe = null;

        Expression ae = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:492:5: (oe= orExp ae= assignExp2 )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:492:7: oe= orExp ae= assignExp2
            {
            pushFollow(FOLLOW_orExp_in_assignExp3279);
            oe=orExp();

            state._fsp--;

            pushFollow(FOLLOW_assignExp2_in_assignExp3283);
            ae=assignExp2();

            state._fsp--;

             node = ae==null ? oe : new AssignOp(oe.getLocation(), oe, ae); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "assignExp"


    // $ANTLR start "assignExp2"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:495:1: assignExp2 returns [Expression node] : ( ASSIGN oe= orExp ae= assignExp2 | );
    public final Expression assignExp2() throws RecognitionException {
        Expression node = null;

        Expression oe = null;

        Expression ae = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:496:5: ( ASSIGN oe= orExp ae= assignExp2 | )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ASSIGN) ) {
                alt32=1;
            }
            else if ( (LA32_0==RBRACKET||LA32_0==RPAREN||LA32_0==COMMA||LA32_0==SEMI) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:496:7: ASSIGN oe= orExp ae= assignExp2
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignExp23333); 
                    pushFollow(FOLLOW_orExp_in_assignExp23337);
                    oe=orExp();

                    state._fsp--;

                    pushFollow(FOLLOW_assignExp2_in_assignExp23341);
                    ae=assignExp2();

                    state._fsp--;

                     node = ae==null ? oe : new AssignOp(oe.getLocation(), oe, ae); 

                    }
                    break;
                case 2 :
                    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:498:29: 
                    {
                     node = null; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "assignExp2"


    // $ANTLR start "exp"
    // /home/rc/d/536proj/src/cs536/syntax/MinC.g:501:1: exp returns [Expression node] : e= assignExp ;
    public final Expression exp() throws RecognitionException {
        Expression node = null;

        Expression e = null;


        try {
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:502:5: (e= assignExp )
            // /home/rc/d/536proj/src/cs536/syntax/MinC.g:502:7: e= assignExp
            {
            pushFollow(FOLLOW_assignExp_in_exp3426);
            e=assignExp();

            state._fsp--;

             node = e; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "exp"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\4\4\5\1\uffff\1\36\1\5\1\15\1\6\1\uffff\1\5";
    static final String DFA2_maxS =
        "\1\13\4\14\1\uffff\1\36\1\14\1\23\1\6\1\uffff\1\14";
    static final String DFA2_acceptS =
        "\5\uffff\1\2\4\uffff\1\1\1\uffff";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\3\uffff\1\1\1\2\1\3\1\4",
            "\1\6\1\uffff\1\7\4\uffff\1\10",
            "\1\6\1\uffff\1\7\4\uffff\1\10",
            "\1\6\1\uffff\1\7\4\uffff\1\10",
            "\1\6\1\uffff\1\7\4\uffff\1\10",
            "",
            "\1\11",
            "\1\6\1\uffff\1\7\4\uffff\1\10",
            "\1\5\4\uffff\2\12",
            "\1\13",
            "",
            "\1\6\1\uffff\1\7\4\uffff\1\10"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "168:1: decl returns [GlobalDeclaration node] : (g= globalVarDecl | f= funcDecl );";
        }
    }
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\10\4\5\1\36\1\5\1\22\1\6\2\uffff\1\5";
    static final String DFA8_maxS =
        "\1\13\4\14\1\36\1\14\1\23\1\6\2\uffff\1\14";
    static final String DFA8_acceptS =
        "\11\uffff\1\1\1\2\1\uffff";
    static final String DFA8_specialS =
        "\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\2\1\3\1\4",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\10",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\11\1\12",
            "\1\13",
            "",
            "",
            "\1\5\1\uffff\1\6\4\uffff\1\7"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "231:1: globalVarDecl returns [GlobalVarDecl g] : (t= type i= IDENT ASSIGN e= exp SEMI | t= type i= IDENT SEMI );";
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\10\4\5\1\36\1\5\1\22\1\6\2\uffff\1\5";
    static final String DFA9_maxS =
        "\1\13\4\14\1\36\1\14\1\23\1\6\2\uffff\1\14";
    static final String DFA9_acceptS =
        "\11\uffff\1\1\1\2\1\uffff";
    static final String DFA9_specialS =
        "\14\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2\1\3\1\4",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\10",
            "\1\5\1\uffff\1\6\4\uffff\1\7",
            "\1\11\1\12",
            "\1\13",
            "",
            "",
            "\1\5\1\uffff\1\6\4\uffff\1\7"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "238:1: varDeclStmt returns [VarDeclStmt v] : (t= type i= IDENT ASSIGN e= exp SEMI | t= type i= IDENT SEMI );";
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\7\1\uffff\1\7\7\uffff";
    static final String DFA11_maxS =
        "\1\44\1\uffff\1\44\7\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\2\1\3";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\5\4\1\2\5\6\uffff\1\2\1\3\1\uffff\1\4\1\6\1\7\13\5",
            "",
            "\1\11\4\uffff\2\11\5\uffff\1\10\6\uffff\13\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "250:1: stmt returns [Statement node] : (v= varDeclStmt | r= RETURN SEMI | r= RETURN e= exp SEMI | i= IF LPAREN cond= exp RPAREN thenBody= stmtOrBody ( options {greedy=true; } : ELSE elseBody= stmtOrBody | ) | wh= WHILE LPAREN e= exp RPAREN sob= stmtOrBody | e= exp SEMI | wr= WRITE e= exp SEMI | rd= READ i= IDENT SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_decl_in_program108 = new BitSet(new long[]{0x0000000000000F12L});
    public static final BitSet FOLLOW_globalVarDecl_in_decl144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_decl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groundType_in_type276 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_LBRACKET_in_type294 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_intLit_in_type298 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACKET_in_type300 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_STAR_in_type326 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_BOOL_in_groundType370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_groundType389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_groundType409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_groundType426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_funcDecl465 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_funcDecl469 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl471 = new BitSet(new long[]{0x0000000000004F00L});
    public static final BitSet FOLLOW_formalList_in_funcDecl475 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LBRACE_in_funcDecl479 = new BitSet(new long[]{0x0000001FFFB13F80L});
    public static final BitSet FOLLOW_stmtList_in_funcDecl483 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_funcDecl485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalArg_in_formalList563 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_formalList601 = new BitSet(new long[]{0x0000000000000F00L});
    public static final BitSet FOLLOW_formalArg_in_formalList605 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_type_in_formalArg663 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_formalArg667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVarDecl717 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_globalVarDecl721 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ASSIGN_in_globalVarDecl723 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_globalVarDecl727 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_globalVarDecl729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_globalVarDecl761 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_globalVarDecl765 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_globalVarDecl767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclStmt812 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_varDeclStmt816 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclStmt818 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_varDeclStmt822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_varDeclStmt824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclStmt856 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_varDeclStmt860 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_varDeclStmt862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclStmt_in_stmt912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_stmt944 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_stmt946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_stmt978 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_stmt982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_stmt984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_stmt1016 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_stmt1018 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_stmt1022 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAREN_in_stmt1024 = new BitSet(new long[]{0x0000001FFFB0BF80L});
    public static final BitSet FOLLOW_stmtOrBody_in_stmt1028 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ELSE_in_stmt1058 = new BitSet(new long[]{0x0000001FFFB0BF80L});
    public static final BitSet FOLLOW_stmtOrBody_in_stmt1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_stmt1126 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_stmt1128 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_stmt1132 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAREN_in_stmt1134 = new BitSet(new long[]{0x0000001FFFB0BF80L});
    public static final BitSet FOLLOW_stmtOrBody_in_stmt1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_stmt1170 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_stmt1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_stmt1204 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_stmt1208 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_stmt1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_stmt1242 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_stmt1246 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SEMI_in_stmt1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtOrBody1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_stmtOrBody1310 = new BitSet(new long[]{0x0000001FFFB13F80L});
    public static final BitSet FOLLOW_stmtList_in_stmtOrBody1314 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_stmtOrBody1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtList1376 = new BitSet(new long[]{0x0000001FFFB03F82L});
    public static final BitSet FOLLOW_nullLit_in_literalExp1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLit_in_literalExp1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLit_in_literalExp1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intLit_in_literalExp1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doubleLit_in_literalExp1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_nullLit1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLit1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLit1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_stringLit1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_intLit1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_LIT_in_doubleLit1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalExp_in_atomExp1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atomExp1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atomExp1813 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_atomExp1815 = new BitSet(new long[]{0x0000001FFC007080L});
    public static final BitSet FOLLOW_actualsList_in_atomExp1819 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAREN_in_atomExp1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atomExp1859 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_atomExp1863 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAREN_in_atomExp1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_actualsList1925 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_actualsList1951 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_actualsList1955 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_atomExp_in_arrExp1999 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_LBRACKET_in_arrExp2021 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_exp_in_arrExp2025 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACKET_in_arrExp2027 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_arrExp_in_postIncDecExp2067 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_DECR_in_postIncDecExp2101 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_INCR_in_postIncDecExp2135 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_DECR_in_preIncDecExp2212 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_preIncDecExp_in_preIncDecExp2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCR_in_preIncDecExp2248 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_preIncDecExp_in_preIncDecExp2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postIncDecExp_in_preIncDecExp2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_minusNotExp2317 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_minusNotExp_in_minusNotExp2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LNOT_in_minusNotExp2333 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_minusNotExp_in_minusNotExp2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preIncDecExp_in_minusNotExp2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_starExp2382 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_starExp_in_starExp2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusNotExp_in_starExp2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADDROF_in_addrExp2436 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_addrExp_in_addrExp2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_starExp_in_addrExp2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addrExp_in_timesDivModExp2518 = new BitSet(new long[]{0x0000006000000082L});
    public static final BitSet FOLLOW_STAR_in_timesDivModExp2550 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_addrExp_in_timesDivModExp2554 = new BitSet(new long[]{0x0000006000000082L});
    public static final BitSet FOLLOW_DIV_in_timesDivModExp2598 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_addrExp_in_timesDivModExp2602 = new BitSet(new long[]{0x0000006000000082L});
    public static final BitSet FOLLOW_MOD_in_timesDivModExp2646 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_addrExp_in_timesDivModExp2650 = new BitSet(new long[]{0x0000006000000082L});
    public static final BitSet FOLLOW_timesDivModExp_in_addSubExp2711 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_PLUS_in_addSubExp2736 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_timesDivModExp_in_addSubExp2740 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_MINUS_in_addSubExp2784 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_timesDivModExp_in_addSubExp2788 = new BitSet(new long[]{0x0000008400000002L});
    public static final BitSet FOLLOW_addSubExp_in_ltGtExp2848 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_LT_in_ltGtExp2878 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_addSubExp_in_ltGtExp2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_ltGtExp2901 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_addSubExp_in_ltGtExp2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_ltGtExp2921 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_addSubExp_in_ltGtExp2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_ltGtExp2942 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_addSubExp_in_ltGtExp2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ltGtExp_in_eqExp2978 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_EQUAL_in_eqExp3014 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_ltGtExp_in_eqExp3018 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_NEQUAL_in_eqExp3066 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_ltGtExp_in_eqExp3070 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_eqExp_in_andExp3130 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_LAND_in_andExp3168 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_eqExp_in_andExp3172 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_andExp_in_orExp3205 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_LOR_in_orExp3242 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_andExp_in_orExp3246 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_orExp_in_assignExp3279 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_assignExp2_in_assignExp3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assignExp23333 = new BitSet(new long[]{0x0000001FFC003080L});
    public static final BitSet FOLLOW_orExp_in_assignExp23337 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_assignExp2_in_assignExp23341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExp_in_exp3426 = new BitSet(new long[]{0x0000000000000002L});

}