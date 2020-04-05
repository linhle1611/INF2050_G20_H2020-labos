/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jberger.pergen.generated.node;

import org.jberger.pergen.generated.analysis.Analysis;

@SuppressWarnings("nls")
public final class AMoreInnerDefinition extends PMoreInnerDefinition
{
    private TComma _comma_;
    private PInnerDefinition _innerDefinition_;

    public AMoreInnerDefinition()
    {
        // Constructor
    }

    public AMoreInnerDefinition(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PInnerDefinition _innerDefinition_)
    {
        // Constructor
        setComma(_comma_);

        setInnerDefinition(_innerDefinition_);

    }

    @Override
    public Object clone()
    {
        return new AMoreInnerDefinition(
            cloneNode(this._comma_),
            cloneNode(this._innerDefinition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMoreInnerDefinition(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PInnerDefinition getInnerDefinition()
    {
        return this._innerDefinition_;
    }

    public void setInnerDefinition(PInnerDefinition node)
    {
        if(this._innerDefinition_ != null)
        {
            this._innerDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._innerDefinition_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._innerDefinition_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._innerDefinition_ == child)
        {
            this._innerDefinition_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._innerDefinition_ == oldChild)
        {
            setInnerDefinition((PInnerDefinition) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
