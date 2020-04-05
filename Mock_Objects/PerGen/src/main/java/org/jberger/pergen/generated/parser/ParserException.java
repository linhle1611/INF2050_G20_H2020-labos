/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jberger.pergen.generated.parser;

import org.jberger.pergen.generated.node.Token;

@SuppressWarnings("serial")
public class ParserException extends Exception
{
    Token token;

    public ParserException(@SuppressWarnings("hiding") Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return this.token;
    }
}
