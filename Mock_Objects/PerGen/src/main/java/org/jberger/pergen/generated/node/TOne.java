/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jberger.pergen.generated.node;

import org.jberger.pergen.generated.analysis.Analysis;

@SuppressWarnings("nls")
public final class TOne extends Token
{
    public TOne(String text)
    {
        setText(text);
    }

    public TOne(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOne(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOne(this);
    }
}
